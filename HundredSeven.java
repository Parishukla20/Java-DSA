// Find and delete the Nth Node from the end of Linked List

public class HundredSeven {

    // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode curr = head;

        // Find size
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // If we need to remove the first node
        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;  // position just before the node to delete
        ListNode prev = head;

        // Move to (indexToSearch - 1)
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Delete node
        prev.next = prev.next.next;

        return head;
    }

    // Print list
    static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to run and test in VS Code
    public static void main(String[] args) {

        HundredSeven obj = new HundredSeven();

        // Create linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        print(head);

        // Remove 2nd node from end → removes 4
        head = obj.removeNthFromEnd(head, 2);

        System.out.println("After Removing 2nd from End:");
        print(head);
    }
}
