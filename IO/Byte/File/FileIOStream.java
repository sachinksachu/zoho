import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fInputStream = null;
        FileOutputStream fOutputStream = null;
        FileOutputStream fOutputStream2 = null;

        String path = "../Sample.txt";
        String text = "Sourav Ganguly";
        int i=0;
        char c;

        try {
            fInputStream = new FileInputStream(path);
        } catch (Exception e) {
            System.out.println(e);
        }

        //read
        while((i = fInputStream.read())!=-1)
        {
            c = (char)i;
            System.out.print(c);
        }

        //read(byte[], offset, length)
        try {
            fOutputStream = new FileOutputStream(path);
            byte[] bytes = text.getBytes();
            fOutputStream.write(bytes);
        } catch (Exception e) {
            System.out.println(e);
        }

        
        //appending
        try {
            fOutputStream2 = new FileOutputStream(path,true);// second paramter 'true'
            byte[] bytes = text.getBytes();
            fOutputStream2.write(10); // newline
            fOutputStream2.write(bytes);
        } catch (Exception e) {
            System.out.println(e);
        }

        fInputStream .close();
        fOutputStream.close();
        fOutputStream2.close();
        
    }
}
