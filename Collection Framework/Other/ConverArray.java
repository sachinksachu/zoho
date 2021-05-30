import java.util.stream.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import org.json.simple.JSONArray;

import jdk.nashorn.internal.parser.JSONParser;
public class ConverArray {

    public static void main(String[] args) {

        // primitive array to List -------------------------------------------------------------------
        int[] arr = { 1, 2, 3, 4, 5 };

        List<Integer> list = Arrays.stream(arr) // IntStream
                                    .boxed() // Stream<Integer>
                                    .collect(Collectors.toList());
        System.out.println("array is "+Arrays.toString(arr));
        System.out.println("list is "+list);


        //non primitive ------------------------------------------------------------------------------
        Integer[] array = new Integer[] {20,43,12,6,83};

        List<Integer> list2 = Arrays.asList(array);
        System.out.println("array is "+Arrays.toString(array));
        System.out.println("list is "+list2);

        //array to Map -------------------------------------------------------------------------------
        String student = "1:Aashish, 2:Bina, 3:Chintu";
        Map<Integer,String> map = new HashMap<>();

        String[] slice = student.split(",");

        for(String str: slice){

            String[] keyValue = str.split(":");

            int key = Integer.parseInt(keyValue[0].trim());
            String value = keyValue[1].trim();

            map.put(key,value);
        }

        System.out.println("map is : "+map);

        //array to Set -------------------------------------------------------------------

        //1. brute force
        Set<Integer> set1 = new HashSet<>();
        for (Integer t : array) {
            // Add each element into the set
            set1.add(t);
        }
        System.out.println("set is : "+set1);

        //2. arrays.asList
        Set<Integer> set2 = new HashSet(Arrays.asList(array));
        System.out.println("set is : "+set2);

        //3.
        Set<Integer> set3 = new HashSet<>();
  
        // Add the array to set
        set3.addAll(Arrays.asList(array));
        System.out.println("set is : "+set3);

        
    }
}
