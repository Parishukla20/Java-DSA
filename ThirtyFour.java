//Make a function to multiply 2 numbers 

import java.util.*;
public class ThirtyFour {
    public static void printMul(int a,int b){
        System.out.print(a*b);
        return;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printMul(a,b);
    }
}

