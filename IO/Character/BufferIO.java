import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BufferIO {
    public static void main(String[] args) {

        int bufferSize = 4 * 1024;
        ArrayList<String> arrayList = new ArrayList<String>();
        String line = "";

        try {
            FileReader file = new FileReader("Sample2.txt");

            BufferedReader buffer = new BufferedReader(file, bufferSize);// (fileObject,bufferSize)

            // read(),returns int, reads one character at a time
            // read(CharBuffer[] target) , reads into the target buffer

            // readLine(), returns String until encounters a "\n or \r"
            String textInFile = buffer.readLine();
            System.out.println("Text in file : " + textInFile);

            // read all Lines in test
            while (line != null) {
                arrayList.add(line);
                line = buffer.readLine();
            }

            // skip(), which can be used to skip over a number of characters in the input

            // close()
            buffer.close();
            file.close();
            System.out.println("Stored in ArrayList : " + arrayList);

        } catch (Exception e) {
            System.out.println(e);
        }

        // -----------------------BufferedWriter------------------------------

        try {
            FileWriter file = new FileWriter("Sample2.txt", true);
            BufferedWriter writer = new BufferedWriter(file);
            String name ="\nRahul";
            char[] address = {'N','E','W','Y','O','R','k'};
            //write(int)
            writer.write(67);

            //write(char)
            writer.write('A');

            //write(String, offset, length)
            writer.write(name);

            writer.write(address);

            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
