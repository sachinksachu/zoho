import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileIOReader {
    public static void main(String[] args) {

        char[] array = new char[105];

        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("Sample.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Creates a FileReader specifying the encoding
            FileReader input2 = new FileReader("Sample.txt", Charset.forName("UTF8"));

            // Returns the character encoding of the file reader
            System.out.println("Character encoding of input1: " + input.getEncoding());
            System.out.println("Character encoding of input2: " + input2.getEncoding());

            // Closes the reader
            input.close();
            input2.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // ---------------------FileWriter--------------------------------

        String data = "This is the data in the output file";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("Sample2.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
