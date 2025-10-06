//write a func which takes in 2 numbers and return the greater of those two
import java.util.*;
public class ThirtyEight {
    public static void greatNum(int a,int b){
        if(a>b){
            System.out.print(a +" is greater");
        }
        else{
            System.out.println(b +" is greater");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greatNum(a,b);
    }
}
