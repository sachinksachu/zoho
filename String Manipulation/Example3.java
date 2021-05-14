public class Example3 {
    
    public static void main(String[] args) {
        String feature = "object oriented programming / coding";
        String regex = "(.*)oriented(.*)";
        String subString = "programming";
        // endsWith
        System.out.println(feature.endsWith("ing"));// returns true

        //startsWith
        System.out.println(feature.startsWith("o"));// returns true

        //indexOf. if false return -1
        System.out.println("Index of oriented : "+feature.indexOf("oriented"));//returns index of starting letter  ie ..7

         //lastIndexOf
         System.out.println("last occuring Index of ing : "+feature.lastIndexOf("ing"));//returns index of last occurance of char or sub string  ie ..31
         System.out.println("last occuring Index of o : "+feature.lastIndexOf("o"));//returns index of last occurance of char or sub string  ie ..29
         System.out.println("last occuring Index of o before index 14 : "+feature.lastIndexOf("o",14));//returns index of last occurance of char or sub string before index 14  ie ..7
        
        //charAt
        System.out.println("character at Index 16: "+feature.charAt(16));// returns the char at index 16 ie.. p

        //contains
        System.out.println("string contains \'ing\' : "+feature.contains("ing"));

        //matches
        // checks whether the String is matching with the specified "regular expression".
        System.out.println("Regex matches string : "+feature.matches(regex)); //return true

        // regionMatches()
        // tests if the two Strings are equal.
        //compare the substring of input String with the substring of specified String.
        //(starting index, subString, offSet index, len )
        System.out.println(feature.regionMatches(16, subString, 0, 7));//search 'program' [0-7] in subString in String 'feature'.

        //isEmpty
        System.out.println("is String empty : "+feature.isEmpty());

    }
    
}

//OUTPUT
// true
// true
// Index of oriented : 7
// last occuring Index of ing : 31
// last occuring Index of o : 29
// last occuring Index of o before index 14 : 7
// character at Index 16: p