//HashSet Data Structure in Java(unique elements only)
import java.util.HashSet;
public class HundredThirtyEight {
    public static void main(String args[]){
        //creating HashSet
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//it does not store
        //Searching - contains()
        if(set.contains(1)){
            System.out.println("Set contain 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }
        //Delete
        set.remove(1);
        //Size
        System.out.println("size of set is "+ set.size());
        //Print all elements
        System.out.println(set);
    }
}
