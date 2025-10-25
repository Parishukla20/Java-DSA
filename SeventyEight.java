//Print Keypad Combination of Keypad Mobiles. Like 0-.,1-abc,2-def,3-ghi
//Time complexity is O(4^n) because at every level max choices are four and max length is n.

public class SeventyEight {
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str,int idx,String newString){
        if(idx== str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i =0;i<mapping.length();i++){
            printCombination(str, idx+1, newString+mapping.charAt(i));
        }
    }
    public static void main (String args[]){
        String str= "4";
        printCombination(str, 0, "");
    }
}
