public class Example4 {
    
    public static void main(String[] args) {
        String sentence = "java is object * oriented program language * java is * powerful program language";
        String sentence2 = "  Hello Geeks  ";
        System.out.println("--Original String-- : "+sentence);
        //replace
        //replace some char with another char or some String with another String, replace all occurance
        String str1 = sentence.replace("is", "is a");
        System.out.println("--replace --: "+str1);
        
        //replaceAll
        // use a regular expression pattern. replace all occurance
        String str2 = sentence.replaceAll("program", "programming");
        System.out.println("--replaceAll --: "+str2);

        //replaceFirst
        String str3 = sentence.replaceFirst("java", "c++");
        System.out.println("--replaceFirst-- : "+str3);

        //split
        //returns array of string, it takes (regex,limit). limit > 0 : applies limit -1 times
        String[] str4= sentence.split("is",3);
        System.out.println("--Split --: ");
        for (String a : str4)
            System.out.println(a);

        String[] str5 = sentence.split("\\*",3); // use \\ while using escape special characters
        System.out.println("--Split using regrex --: ");
        for (String a : str5)
            System.out.println(a);

        //subString
        //returns string from begining index to end index -1
        System.out.println("--SubString --: "+sentence.substring(26, 42));

        //trim
        //removes all whitespace from both end of the string
        System.out.println("--Trim --: "+sentence2.trim());
    }
}
