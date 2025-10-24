//Print a string in reverse using recursion
//Time complexity = O(n) = str length
 
public class SeventyOne {
    public static void printReverse(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String args[]){
        String str="abcd";
        printReverse(str, str.length()-1);
    }
}
