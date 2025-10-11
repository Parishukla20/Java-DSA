//Print sum of first n natural numbers using recursion
//1+2+3+4+.....+n = n*(n+1)/2

public class SixtyFive {
    public static void naturalNum(int i,int n,int sum){
        if(i==n){
          sum +=i;
            System.out.println(sum);
            return;
        }
    sum +=i;
    naturalNum(i+1,n,sum);
    }
    public static void main(String args[]){
        naturalNum(1,5,0);
    }
}
