import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,String> tmap = new TreeMap<String,String>();

        tmap.put("a", "Munich");
        tmap.put("v", "Jordan");
        tmap.put("b", "Tanzania");
        tmap.put("t", "Azerbeijan");

        for(Map.Entry entry : tmap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
