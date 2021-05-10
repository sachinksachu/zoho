class DisplayOverloading
{
    public void display(char c)
    {
         System.out.println(c);
    }

    public void display(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
public class OverLoading
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();

       //same name, access modifier & data type  but different parameter
       obj.display('a');
       obj.display('a',10);
   }
}