//Print all the subsets of a set of first n natural numbers take n =3.
//Subsets are (1,2,3),(1,2),(1,3),(2,3),(3),(1),(2),(.)

import java.util.ArrayList;

public class EightyTwo {
    public static void printSubset(ArrayList<Integer>subset){
        for(int i=-0;i<subset.size();i++){
            System.out.print(subset.get(i)+"");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String args[]){
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
