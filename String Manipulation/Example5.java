public class Example5 {
    public static void main(String[] args) {
        Float num =5f ;
        String normalCase = "Mouse";
        
        //toString
        //takes a primitive data type as an argument, then the String object representing the primitive data type value is returned.
        System.out.println("toString() : "+Float.toString(10f));//This returns a String object representing the value of this Integer.
        System.out.println("toString() : "+num.toString());//This returns a String object representing the specified integer.
        

        //toUpperCase
        System.out.println("Uppr case : "+normalCase.toUpperCase());

        //toLowerCase
        System.out.println("Lower case : "+normalCase.toLowerCase());

        
    }
}
