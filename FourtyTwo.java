//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x power n.
import java.util.*;
public class FourtyTwo {
    public static void power(int x,int n){
        int result=(int)Math.pow(x,n);
        System.out.println(result);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x,n);
    }
}
