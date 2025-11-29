//search an element in linked list

class Node {
    int data;
    Node next;
}

public class SearchList {
    static Node head;

    public static boolean search(int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(); a.data = 5;
        Node b = new Node(); b.data = 10;
        Node c = new Node(); c.data = 20;
        a.next = b; b.next = c;
        head = a;

        System.out.println(search(10));  
        System.out.println(search(40));
    }
}
