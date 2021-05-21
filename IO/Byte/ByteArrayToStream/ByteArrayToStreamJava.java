import java.io.ByteArrayInputStream;
import java.io.IOException;
public class ByteArrayToStreamJava {
    public static void main(String[] args) throws IOException {
        byte[] buf = {65, 66, 67, 68, 69};
        ByteArrayInputStream bais = null;
        
        try {
           // create new byte array input stream
           bais = new ByteArrayInputStream(buf);

           //available
           System.out.println("bytes availabe : "+bais.available());
           
           int b =0;
           
           // read till the end of the stream
           while((b = bais.read())!=-1) {
              
              // convert byte to character
              char c = (char)b;
              
              // print
              System.out.println("byte :"+b+"; char : "+ c);
              
           }
           System.out.print(bais.read()+" Reached the end");
           
        } catch(Exception e) {
           // if I/O error occurs
           e.printStackTrace();
        } finally {
           if(bais!=null)
           bais.close();
        }   
     }
}

//note : the ByteArrayInputStream class can turn a byte array into an InputStream.
// methods
    //1. skip(int n) : skip 'n' bytes from input stream
    //2. mark & reset() 