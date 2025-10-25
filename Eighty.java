//Count total paths in a maze to move from (0,0) to (n,m) where n=3,n=3
//Move from (0,0)to(3,3) in a matrix.
//Here it gives worst time complexity . So that we have to use dynamic programming for this to get better time complexity.

public class Eighty {
    public static int countPaths(int i,int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i== n-1 && j== m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);
        //right move
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }
    public static void main(String args[]){
        int n =3,m=3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
