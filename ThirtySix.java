//enter 3 number from user and make a function to print their average
import java.util.*;
public class ThirtySix {
    public static void average(int a,int b,int c){
        System.out.print((a+b+c)/3);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
}
