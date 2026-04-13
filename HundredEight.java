// Check if a Linked List is a Palindrome
// 1 ->2 ->2 ->1

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class HundredEight {
    public boolean isPalindrome(ListNode head){

        // Step 1: get the string of all values
        String s = "";
        ListNode temp = head;

        while(temp != null){
            s = s + temp.val;
            temp = temp.next;
        }

        // Step 2: check palindrome
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        // Creating list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        HundredEight obj = new HundredEight();

        boolean ans = obj.isPalindrome(head);

        if(ans){
            System.out.println("Palindrome Linked List");
        } else {
            System.out.println("Not a Palindrome Linked List");
        }
    }
}
