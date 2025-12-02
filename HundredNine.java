// Detect a cycle in a Linked List + Trick to Remove the cycle

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class HundredNine {

    // Detect cycle using Floyd's Algorithm
    public boolean hasCycle(ListNode head){
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true; // cycle found
            }
        }
        return false;
    }

    // Remove cycle
    public void removeCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        boolean cycle = false;

        // Step 1: Detect meeting point
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(!cycle) return; // no cycle

        // Step 2: move one pointer to head
        fast = head;

        // Step 3: move both one step until they meet
        while(fast.next != slow.next){
            fast = fast.next;
            slow = slow.next;
        }

        // Step 4: break the cycle
        slow.next = null;
    }

    // Print list safely
    public static void printList(ListNode head){
        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args){

        // Creating Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating cycle manually: 5 -> points to 3
        head.next.next.next.next.next = head.next.next;

        HundredNine obj = new HundredNine();

        // Detect cycle
        if(obj.hasCycle(head)){
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }

        // Remove cycle
        obj.removeCycle(head);

        // Check again
        if(obj.hasCycle(head)){
            System.out.println("Cycle still present");
        } else {
            System.out.println("Cycle removed successfully");
        }

        // Print list after removing cycle
        System.out.println("Linked List after cycle removal:");
        printList(head);
    }
}
