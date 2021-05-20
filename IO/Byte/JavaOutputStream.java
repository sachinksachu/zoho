import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaOutputStream {

    public static void writeSingleByteToFile(String filepath, String text) throws IOException {

        byte[] bytes = text.getBytes(); // method encodes the string into a sequence of bytes and stores it in a byte array
                                        
        try (OutputStream out = new FileOutputStream(filepath)) {
            out.write(bytes);
        }
        catch (Exception e) {
            System.out.print("Exception "+e+" occured");
        }
    }

    public static void writeByteSequenceToFile(String filepath, String text) throws IOException {

        byte[] bytes = text.getBytes(); // method encodes the string into a sequence of bytes and stores it in a byte array
                                        
        OutputStream out = new FileOutputStream(filepath);
        out.write(bytes, 6, 5);//write from offset 6 and comprising 5 characters
        
       
    }

    public static void main(String[] args) {
        String filepath = "./Sample1.txt";
        String text = "Hello world";

        try {
            writeSingleByteToFile(filepath, text);
        } catch (Exception e) {
            System.out.print("Exception "+e+" occured");
        }
        

        try {
            writeByteSequenceToFile(filepath, text);
        } catch (Exception e) {
            System.out.print("Exception "+e+" occured");
        }
        
    }
}
