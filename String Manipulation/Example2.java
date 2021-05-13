public class Example2 {
    public static void main(String[] args) {

        // copyValueOf
        char[] str1 = { 's', 't', 'a', 'c', 'k' }; // character array
        String str2 = "overflow";
        String str3 = "";
        str3 = str3.copyValueOf(str1);// returns a String that represents the characters of a char array.
        System.out.println(str3 + str2);

        // endsWith
        String feature = "object oriented programming";
        System.out.println(feature.endsWith("programming"));// returns true

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
    }
}
