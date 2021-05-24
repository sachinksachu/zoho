    import java.util.Scanner;  
    public class OddEven  
    {  
    //user defined method  
    public static void findEvenOdd(int num)  //static keyword is used, to call function without using object
    {  
    //method body  
    if(num%2==0)   
    System.out.println(num+" is even");   
    else   
    System.out.println(num+" is odd");  
    }  

    //main
    public static void main (String args[])  
    {  
         
    Scanner scan=new Scanner(System.in);  
    System.out.print("Enter the number: ");  
 
    int num=scan.nextInt();  
    //method calling  
    findEvenOdd(num);  //calling without using object, bcoz function is static
    }  
    
    }  