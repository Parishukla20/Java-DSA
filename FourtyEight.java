
import java.util.*;
public class FourtyEight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] numbers = new int[rows][columns];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        //search
        System.out.println("Enter number you want to search");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(x==numbers[i][j]){
                    System.out.print(i+","+j);
                }
            }
        }
    }
}
