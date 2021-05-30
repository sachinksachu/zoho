import java.util.Scanner;
import java.lang.Math;

public class Read {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int input = scan.nextInt(); //read int from user
        System.out.println("The square of your Input is "+Math.pow(input,2));
        

        //declare String array, contains elements of same data type
        String[] myArray = new String[20];//size 20
        for(int i=0;i<20; i++){
            myArray[i]="i";//inserting String i
        }
        for(String i:myArray){
            System.out.println(i);
        }

        //declare int array
        int[] myInt = {11,20,34};
        //printing array using for-each loop  
        //For-each Loop for Java Array
        for(int i:myInt)//for(datatype_of_array variable : array name)
        System.out.println(i); 
        
        int a[]={33,3,4,5};//declaration, instantiation and initialization

        System.out.println("enter character");
        char c = scan.next().charAt(0); //next() reads string & charAt reads ath specific index
        System.out.println("you entered character : "+c);
        scan.close();
    }
}

//match string array
static int[] matchingStrings(String[] strings, String[] queries) {

    int[] tempArray = new int[queries.length];
    for(int i=0;i< queries.length;i++){
        int count =0;
        tempArray[i]=0;
        for(int j=0;j<strings.length;j++){
            
            if(strings[j].equals(queries[i])){    
                count=count+1;
                tempArray[i] = count;
            }
        }
        
    }
    return tempArray;

}

"=="
//compares object

"equals()"
//compares string

"comparesTo"
//compares values lexicographically

String s1="Sachin";  
String s2="Sachin";  
String s3="Ratan";  
System.out.println(s1.compareTo(s2));//0  
System.out.println(s1.compareTo(s3));//1(because s1>s3)  
System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  

//check substring

"contains" //return boolean
    String greeting = "HelloWorld";
    boolean isFound = greeting.toLowerCase().contains("hell");

"indexOf" //return int -> 0 if true else -1
    String greeting = "HelloWorld";
    int isFound = greeting.toLowerCase().indexOf("hell");