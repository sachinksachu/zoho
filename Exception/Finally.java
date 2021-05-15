public class Finally {
    public static void main(String[] args) {
        
        try {
            int x =  25/0;
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Execute this block of code whether handled exception or not");
        }
        


    }
}
