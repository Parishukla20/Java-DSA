//Fint the factorial of a number using functions
import java.util.*;
public class ThirtyFive {
    public static void fact(int num){
        if(num<0){
            System.out.println("Invalid Number");
            return;    //if condition true then it return from function
        }
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
    }
}
