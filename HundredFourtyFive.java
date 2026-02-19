//Find Itinerary from tickets - (find path from start to end)
//"chennai"->"bengaluru"
//"mumbai"->"delhi"
//"goa"->"chennai"
//"delhi"->"goa"
//"mumbai"->"delhi"->"goa"->"chennai"->"bengaluru"

import java.util.*;
public class HundredFourtyFive {
    //find start
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> reverseMap = new HashMap<>();
        for(String key : tick.keySet()){
            reverseMap.put(tick.get(key),key); //it reverse val->key
        }

        for(String key:tick.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);//mumbai

        while(tickets.containsKey(start)){
            System.out.print(start+"-> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
