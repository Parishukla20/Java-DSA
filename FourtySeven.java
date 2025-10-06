//2D Array 
import java.util.*;
public class FourtySeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        //input numbers in array
        System.out.println("Enter values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //Output numbers of array
        System.out.println("Values are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

    }
}
