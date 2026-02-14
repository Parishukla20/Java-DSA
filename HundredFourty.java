//HashMap in java - store key value pairs(also it is unordered map like hashset)

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HundredFourty {
    public static void main(String args[]){

        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        System.out.println(map);
        //Update
        map.put("China", 180);
        System.out.println(map);
        //Search
        if(map.containsKey("India")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        //Get Value
        System.out.println(map.get("China"));
        //Iteration - for(int val : arr)
        for( Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Iteration second method
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+ map.get(key));
        }
        //Remove pair
        map.remove("China");
        System.out.println(map);
    }
}
