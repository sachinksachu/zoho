import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class Example1 {
    public static void main(String[] args) throws IOException
     { 
        String file = "./Sample.txt";
        byte[] array = new byte[100];
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file)); //added BufferedInputStream to support mark & reset
        
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
        inputStream.read(array);
        String data = new String(array);
        System.out.print("data in file is : "+data);
    }
}
