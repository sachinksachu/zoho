import java.io.IOException;
public class TestThrows {

    static void method()throws IOException{  
        throw new IOException("device error");  
       }  
    public static void main(String[] args)throws IOException {
         
        try {
            method();
        } catch (Exception e) {
            System.out.println(e); 
        }
        
     
       System.out.println("normal flow...");  
    }
}
//Note : throws is a keyword in Java which is used in the signature of method to indicate that this method might throw 
//one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block. 