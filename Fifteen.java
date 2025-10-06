//Use do while loop for printing numbers from 1 to n
import java.util.*;
public class Fifteen {
    public static void main(String args[]){
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        } while(i<=n);
    }
}
