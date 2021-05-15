import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.FileInputStream;
public class TryCatch {
    public static void main(String args[])
    {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("./AsBC.txt");
        }
        catch(Exception exp){
            System.out.println("The specified file is not present at the given path");
        }

        int k;
        try{
            while( (k = fis.read()) != -1){
                System.out.print((char)k);
            }
        }catch(Exception ioexp){
            System.out.println("I/O error occurred: "+ioexp);
        }

       System.out.println("Handled all exception");
    }
}
