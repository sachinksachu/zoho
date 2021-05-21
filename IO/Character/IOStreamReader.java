import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreamReader {
    public static void main(String[] args) {

        // Creates an array of character
        char[] array = new char[110];
    
        try {
          // Creates a FileInputStream
          FileInputStream file = new FileInputStream("Sample.txt");
    
          // Creates an InputStreamReader
          InputStreamReader input = new InputStreamReader(file);
    
          // Creates an InputStreamReader specifying the encoding
          InputStreamReader input2 = new InputStreamReader(file,"UTF16");

          //getEncoding
          // Returns the character encoding of the input stream
          System.out.println("Character encoding of input1: " + input.getEncoding());
          System.out.println("Character encoding of input2: " + input2.getEncoding());

          // Reads characters from the file
          input.read(array,0,40);
          System.out.println("Data in the stream:");
          System.out.println(array);
    
          // Closes the reader
          input.close();
          input2.close();
        }
    
        catch(Exception e) {
          e.getStackTrace();
        }

        //-----------------OutputStreamReader--------------------------

        try { 
            
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("Sample1.txt",true));
            output.write(array,0,40);
            output.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        


        
      }
}
