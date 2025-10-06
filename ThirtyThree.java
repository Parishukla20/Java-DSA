//Make a function to add 2 numbers and return the sum
import java.util.*;
public class ThirtyThree {
    public static void printSum(int a,int b){
        System.out.print(a+b);
        return;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printSum(a,b);
    }
}
