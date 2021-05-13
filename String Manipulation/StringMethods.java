public class StringMethods {

    public static void StringCompare() {
        String string1 ="book";
        String string2 ="book";
        String string3 ="Book";
        String string4 = new String("Book");

        //compareTo
        //ethod compares two strings lexicographically.
        if(string1.compareTo(string2) == 0){ //return 0 if both equal
            System.out.println("string1 & string 2 are equal");
        }

        if(string1.compareTo(string3) == 0){ //return 32 so not equal
            System.out.println("string1 & string3 are equal");
        }
        else{
            System.out.println("string1 & string 3 are not equal");
        }

        //compareToIgnoreCase
        if(string1.compareToIgnoreCase(string3) == 0){ //return 0
            System.out.println("string1 & string3 are equal with \'compareToIgnoreCase\'");
        }

        //equals
        // The equals() method compares two strings, and returns true if the strings are equal, and false if not.
        if(string1.equals(string2)){ //returns true
            System.out.println("string1 & string 2 are equal using \'equals\'");
        }

        //==
        //the == operator is used to comparing the reference of the given strings, depending on if they are referring to the same objects.
        if(string3 == string4){
            System.out.println("string3 & string4 are equal using \'==\'");
        }
        else System.out.println("string3 & string 4 are not equal using \'==\'"); // not equal string created using 'new' operator stores in heap,


    }
    public static void main(String[] args) {
        String name = "Antonio Mercile Aziz";

        System.out.println(name);
        
        //indexOf
        System.out.println("Index of Mercile : "+name.indexOf("Mercile"));//index of starting letter 

        //charAt
        System.out.println("character at Index 16: "+name.charAt(16));//

        //compare String
        StringCompare();
    }
}
