import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) {

        String data = "This is a text inside the file.";

        try {
            FileWriter file = new FileWriter("Sample3.txt");
            PrintWriter output = new PrintWriter(file);

            //print(), to write int, float .. to stream
            output.print(true);
            output.print((int) 123);
            output.print((float) 123.456);

            //printf
            output.printf("I am %d years old", 25);

            output.print(data);

            System.out.println("\nHas any error occurred: "+ output.checkError());
                               
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
