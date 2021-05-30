public class Recursion {

    public static int fact(int n){
        System.out.println("n : "+(n));
        if(n==1)
            return 1;
        else
            return n + fact(n-1);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println("output"+fact(n));
    }
}