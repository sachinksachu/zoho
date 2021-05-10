class Base {
    Base(int x ) {
      System.out.println("Base Class Constructor Called "+x);
    }
  }
   
  class Derived extends Base {
    Derived(int x) {
        super(x); //to call parameterized constructor in base class
      System.out.println("Derived Class Constructor Called "+x);
    }
  }
   
  public class InheritanceExample {
    public static void main(String[] args) { 
      Derived d = new Derived(20);//call base class constructor then derived class.
    }
  }