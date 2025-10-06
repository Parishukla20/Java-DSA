//Compare Two Strings
//We use compare instead of == because sometimes it will fail

public class FiftyThree {
    public static void main(String args[]){
        String name1 = "Pari";
        String name2 = "Pari";
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
