// package Array;
import java.util.Scanner;

public class ReplaceValue {
    
    public static void replace(int[] a, int newvalue, int positionToReplace) {
        
        a[positionToReplace] = newvalue;
        
        if(positionToReplace == 0){
            if(a[positionToReplace]< a[positionToReplace + 1]){
                System.out.println("In Ascending order1");
                printArray(a);
            }
            else{
                System.out.println("Not in Ascending order1");
                printArray(a);
            } 
        }
        else if(positionToReplace == a.length){
            if(a[positionToReplace]> a[positionToReplace - 1]){
                System.out.println("In Ascending order2");
                printArray(a);
            }
            else{
                System.out.println("Not In Ascending order2");
                printArray(a);
            } 
        }
        else{
            if(a[positionToReplace -1] < a[positionToReplace] && a[positionToReplace] < a[positionToReplace+1]){
                System.out.println("In Ascending order3");
                printArray(a);
            }
            else{
                System.out.println("Not in Ascending order3");
                printArray(a);
            } 
        }
    }

    public static void printArray(int[] a){
        System.out.print("Array is: ");
        for(int x : a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = {1,2,5,7,9};

        printArray(a);
        int newvalue;
        int positionToReplace;

        System.out.println("\nPosition to insert ");
        positionToReplace = scan.nextInt();

        System.out.println("Enter value to insert: ");
        newvalue = scan.nextInt();

        replace(a,newvalue,positionToReplace-1);
    }
}
