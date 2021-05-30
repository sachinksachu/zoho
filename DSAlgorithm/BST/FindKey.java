import java.io.*;

class FindKey{

    public boolean find(int[] a, int segmentSize, int key){
        boolean exist = false;
        int i=0;
        int j;
        while(i < a.length){
            
            j= 0;
            exist = false;

            while(j!= segmentSize){
                if(a[i] == key){
                    exist = true;
                    i=i+segmentSize-j;
                    break;
                }
                j++;
                i++;
            }
            
            if(!exist){
                break;
            }
            
        }
        return exist;
    }
    public static void main(String[] args) {
        FindKey obj = new FindKey();
        int[] a = { 1, 3, 4, 3, 3, 31, 1, 31, 13, 3, 13, 5} ;
        int segmentSize = 4;
        int key=3;

        boolean exist = obj.find(a,segmentSize,key);
        System.out.println("exist:"+exist);
    }
}