public class EnumExample2 {
  
    enum Direction {
        EAST(10), WEST(20), NORTH(30), SOUTH(40);

        private int value;//field

        Direction(int value){ //constructor
            this.value = value;
        }

        int returnValues(){ //method
            return value;
        }
    }

    public static void main(String args[]){
        Direction m[] = Direction.values();
        for(int i = 0; i<m.length; i++ ) {
            System.out.println(m[i].value);
        }

        for(int i = 0; i<m.length; i++ ) {
            System.out.println(m[i].returnValues());//calling method to return values
        }
     }
}
