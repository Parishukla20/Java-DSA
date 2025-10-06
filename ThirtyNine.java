//takes radius as input and gives circumference of circle as output
import java.util.*;
public class ThirtyNine {
    public static void circum(int radius){
        double circumference = 2 * 3.14 * radius;
        System.out.print(circumference);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        circum(radius);
    }
}
