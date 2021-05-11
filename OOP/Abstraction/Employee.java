abstract class Person {

    private String name;
    private String gender;

    public Person(){}
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public abstract void work();//abstract method

    public String getDetails() {
        return "Name=" + this.name + "::Gender=" + this.gender;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}

public class Employee extends Person {

    public Employee(){

    }

    public Employee(String EmployeeName, String Gender) {
        super(EmployeeName, Gender);//calling parent constructor
    }
    
    public void work(){//implementation of abstract method
        System.out.println("Employee Started the work");
    }

    public void logout(){
        System.out.println("Logging out ..");
    }


    public static void main(String args[]) {

        Person person = new Employee("Sachin", "male");
        Employee employee = new Employee();
        
        System.out.println(person.getDetails());

        person.work();

        person.changeName("Sachin Tendulkar");

        System.out.println(employee.getDetails());
        employee.logout();
    }

}