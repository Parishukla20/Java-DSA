//Bit Manipulation in Java 
//Clear Bit in java

public class FiftyEight {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int NOT = ~(bitMask);
        int newNumber = NOT & n;
        System.out.println(newNumber);
    }
}
