import java.io.*;
public class Example {  
   public static void main(String args[]) throws IOException
   {
      FileInputStream fis = new FileInputStream("./ABC.txt");
      int k; 

      while(( k = fis.read() ) != -1) 
      { 
	   System.out.print((char)k); 
      } 
      fis.close(); 	
   }
}