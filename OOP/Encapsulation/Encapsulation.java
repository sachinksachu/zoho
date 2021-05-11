
class Student{

    private int age =11;
    private String gender = "male";

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
}

public class Encapsulation{
    public static void main(String args[]) {

        Student obj = new Student();
        
        
        System.out.println("student age "+obj.getAge()+" and gender is "+obj.getGender());

        obj.setAge(15);
        obj.setGender("female");

        System.out.println("student age "+obj.getAge()+" and gender is "+obj.getGender());
    }
}
