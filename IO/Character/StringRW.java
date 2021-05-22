import java.io.StringReader;
import java.io.StringWriter;
// import java.io.StringBuffer;

public class StringRW {
    public static void main(String[] args) {

        String data = "Java StringReader class enables you to turn an ordinary String into a Reader.";

        // Create a character array
        char[] array = new char[100];

        try {
            // Create a StringReader
            StringReader input = new StringReader(data);

            // Use the read method
            // read(), reads single character
            // read(char[], offset, length)
            input.read(array);

            System.out.println("Data read from the string:");
            System.out.println(array);

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // ------------------------StringWriter----------------------------

        String str = "This is the original data";

        try {
            // Create a StringWriter with default string buffer capacity
            StringWriter output = new StringWriter();

            

            // Writes data to the string buffer
            output.write(str);

            //append
            output.append(" from file");

            // Returns the string buffer
            StringBuffer stringBuffer = output.getBuffer();
            System.out.println("StringBuffer: " + stringBuffer);

            // string buffer in string
            String string = output.toString();
            System.out.println("String: " + string);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}