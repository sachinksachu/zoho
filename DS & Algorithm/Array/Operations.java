import java.util.Scanner;

public class Operations {

    public static void insert(int element, int position, int[] arr, int length){

        for(int i =length-2;i>=position-1;i--){
            if(i != position-1 ){
                arr[i+1]= arr[i];
            }
            else{
                arr[i+1]= arr[i];
                arr[i] = element;
            }
                
        }

        for(int i = 0; i < length; i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];
        int length = 6;

        System.out.println("Enter all the elements:");

        for (int i = 0; i < length-1; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter element to insert : ");
        int element = sc.nextInt();

        System.out.println("enter position to insert : ");
        int position = sc.nextInt();

        insert(element, position, arr, length);
    }
}
