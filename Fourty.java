//Takes age as input and give output that it's eligible or not
import java.util.*;
public class Fourty {
    public static void eligible(int age){
        if(age<18){
            System.out.println("Not Eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        eligible(age);
    }
}
