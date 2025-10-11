//Recursion in java
//Print number from 5 to 1

public class SixtyThree {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[]){
           int n = 5;
           printNum(n);
    }
}
