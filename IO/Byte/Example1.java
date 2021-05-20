import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.RandomAccessFile;

public class Example1 {
    public static void main(String[] args) throws IOException
     { 
        String filepath = "./Sample.txt";
        byte[] array = new byte[100];
        byte[] fileBytes = null;

        InputStream inputStream = new BufferedInputStream(new FileInputStream(filepath)); //added BufferedInputStream to support mark & reset
        
        inputStream.mark(1); //The mark() sets a mark internally in the InputStream which marks the point in the stream to which data has been read so far.
        
        int k = 0;  
        //read() , returns an int which contains the byte value of the byte read
        while((k = inputStream.read()) != -1) {  
            //Conversion of a byte into character  
            char ch = (char) k;  
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
          }

        //read(byte[])
        inputStream.reset(); //to go back to the point in the stream where the mark was set,
        System.out.println("number of bytes read : "+inputStream.read(array));//can read data from the InputStream's source into a byte array. returns number of bytes read
        String data = new String(array);
        System.out.println("data in file is : "+data);

        //readAllBytes
        inputStream.reset();
        fileBytes = inputStream.readAllBytes();
        String arrayToString = new String(fileBytes);
        System.out.println("text in file is : "+arrayToString);

        //close
        inputStream.close();

        //RandomAccess
        RandomAccessFile file = new RandomAccessFile("./Sample1.txt", "rw");
        byte[] destination = new byte[128];

        //seek(), read or write at a specific location
        file.seek(20);

        //getFilePointer
        System.out.println("file pointer is at : "+file.getFilePointer());
        
        //read(pointer, offset, lengthToRead)
        int offset = 20;
        int length = 50;
        System.out.println("number of bytes read : "+file.read(destination,offset,length));//can read data from the InputStream's source into a byte array. returns number of bytes read
        String data2 = new String(destination);
        System.out.println("data in file is : "+data2);

        //write
        file.seek(104);
        destination = "\" or write\"".getBytes("UTF-8");
        file.write(destination);

    }
}
