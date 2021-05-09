interface Bank{

    int cashback=10; //implicitly public, static and final.

    void withdraw(double amount);//implicitly public and abstract

    default void deposit(double deposit_amount){// java 8 supports default method
        System.out.println("deposited amount is: "+deposit_amount);
    }

    static void checkBalance(){// java 8 supports static method
        System.out.println("Your balance : 1000");
    }
}

public class Gpay implements Bank{

       public void withdraw(double amount){ //method defenition
        System.out.println("amount is: "+amount);
        System.out.println("cashback is: "+cashback);
    }
    public static void main(String[] args) {
        Bank object = new Gpay();
        object.withdraw(500.00);

        object.deposit(200.00);
        Bank.checkBalance();// calling static method
    }
}