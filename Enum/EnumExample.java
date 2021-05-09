enum Country{
    INDIA, AUSTRALIA, USA, UK
}

public class EnumExample {

    Country value;

    EnumExample(Country value){
        this.value = value;
    }

    public void checkEnumValue(){
        switch(value){
            case INDIA:
            System.out.println("Passed Country is : INDIA");
            break;

            case AUSTRALIA:
            System.out.println("Passed Country is : AUSTRALIA");
            break;

            case USA:
            System.out.println("Passed Country is : USA"); //OUTPUT
            break;

            case UK:
            System.out.println("Passed Country is : UK");
            break;
        }
    }
    public static void main(String[] args) {
        Country c = Country.INDIA; //variable 'c' is of type Country. 'c' can take any one value from 'Country'
        System.out.println(c); //INDIA
        
        //iteration
        for(Country co : Country.values()){ //values() built in function to iterate
            System.out.println(co);
        }

        //ordinal
        System.out.println("Ordinal of INDIA is "+c.ordinal());

        EnumExample obj = new EnumExample(Country.USA);

        obj.checkEnumValue();
    }
}