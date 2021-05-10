class Animal {
    public void displayInfo() {
       System.out.println("I am an animal.");
    }
 }
 
 class Dog extends Animal {
     
    
    public void displayInfo() {
        //super.displayInfo(); // this will invoke 'displayInfo' in Animal
       System.out.println("I am a dog.");
    }
 }
 
public class OverRiding {
    public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.displayInfo();
    }
 }
 
 //OUTPUT
    //I am a dog

    // if super.displayInfo() uncommented then
        //I am an animal.
        //I am a dog.