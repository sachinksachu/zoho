import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderExample {
    public static void main(String[] args) {
        
        char[] array = new char[100];

        try {
            // Creates a reader using the FileReader
            Reader input = new FileReader("./Sample.txt");

            // Checks if reader is ready 
            System.out.println("Is there data in the stream?  " + input.ready());

            //read()
            // Reads characters
            input.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

            // Closes the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e);
        }

        //-----------------------Writer---------------------------------
        String data = "its subclasses can be used to read data.";

        try {
            // Creates a Writer using FileWriter
            Writer output = new FileWriter("Sample.txt",true);


            // Writes string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
