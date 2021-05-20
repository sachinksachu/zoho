import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutstreamJava {
    public static void main(String[] args) throws IOException
    {
        ByteArrayOutputStream geek_output = new ByteArrayOutputStream();
  
        byte[] buffer = {'J', 'A', 'V', 'A'};
  
        // Use of write(byte[] buffer, int offset, int maxlen)
        geek_output.write(buffer, 0, 4);
        System.out.print("Use of write(buffer, offset, maxlen) by toByteArray() : ");
  
        // Use of toByteArray() :
        for (byte b: geek_output.toByteArray()) // creates a new byte array having the same as that of Output Stream
        {
            System.out.print(" " + b);
        }
    }
}
