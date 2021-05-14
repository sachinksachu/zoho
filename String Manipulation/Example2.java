import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        // copyValueOf
        char[] str1 = { 's', 't', 'a', 'c', 'k' }; // character array
        String str2 = "overflow";
        String str3 = "";
        str3 = str3.copyValueOf(str1);// returns a String that represents the characters of a char array.
        System.out.println(str3 + str2);

        //valueOf
        //method returns the String representation of the boolean, char, char array, int, long, float and double arguments.
        char letters[] = {'c','o','m','p','u','t','e','r'};
        String l = String.valueOf(letters);
        System.out.println("char array converted to string : "+l);


        // getChars
        // Copies characters from this string into the destination character array.
        String Str1 = new String("Welcome to Tutorialspoint.com");
        char[] Str2 = new char[7];
        
        try {
            Str1.getChars(2, 9, Str2, 0);//copies value in 'Str1' from 2-9 to 'Str2' from index 0
            System.out.print("Copied Value = ");
            System.out.println(Str2);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        //toCharArray
        Str2 = Str1.toCharArray();
        System.out.println("Convert String to char array");
        for(char c: Str2) System.out.print(c+" ");

    }
}
