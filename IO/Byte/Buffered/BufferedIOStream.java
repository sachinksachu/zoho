import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStream {
    public static void main(String args[]) throws IOException
    {
        // attach the file to FileInputStream
        FileInputStream fin = new FileInputStream("../Sample.txt");
  
        BufferedInputStream bin = new BufferedInputStream(fin);
  
        //available()
        System.out.println("Number of remaining bytes:" + bin.available());
                                           
  
        // illustrating markSupported() and mark() method
        boolean b=bin.markSupported();
        if (b)
            bin.mark(bin.available());

        System.out.println("mark supported : "+ b);

        //skip()
        bin.skip(4);
        System.out.println("FileContents after skipping 4 bytes:");
  
        // read characters from FileInputStream and
        // write them
        int ch;
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);
  
        // illustrating reset() method
        bin.reset();
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);
  
        // close the file
        fin.close();

        //----------------------------BufferedOutputStream---------------------------------------

        String data = " This is a line of text inside the file";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("../Sample.txt",true);

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
