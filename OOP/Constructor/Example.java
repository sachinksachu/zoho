class ParentClass{

    ParentClass(){
        System.out.println("Inside Parent constructor");
    }
}

class Class1 extends ParentClass{

    Class1(){ // non-parameterized constructor
        System.out.println("Inside non-parameterized constructor");
    }

    Class1(String name){ // parameterized constructor
        this(8);//calling another constructor
        System.out.println("Inside parameterized constructor");
        System.out.println("Lesson: "+ name);        
    }

    Class1(int version){
        System.out.println("Java version :"+ version);
    }
}

public class Example {
    public static void main(String args[]) {
        new Class1();
        new Class1("JAVA Constructor");
    }
}

//OUTPUT
// Inside Parent constructor
// Inside non-parameterized constructor
// Inside Parent constructor
// Java version :8
// Inside parameterized constructor
// Lesson: JAVA Constructor

//Whenever a child class constructor gets invoked it implicitly invokes the constructor of parent class.