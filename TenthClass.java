//Check the two numbers are greater or smaller or equal using else if
import java.util.*;
public class TenthClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }
        else if(b>a){
            System.out.println("b is greater");
        }
        else{
            System.out.println("Both are equals");
        }
    }
}
