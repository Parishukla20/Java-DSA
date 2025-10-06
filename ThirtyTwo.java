//Functions
//print name by taking inpit and by using function method

import java.util.*;
public class ThirtyTwo {
    public static void printName(String name){
        System.out.println(name);
        return;   //bahar nikal jaye function se
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();

        printName(name);   // func call 
    }
}
