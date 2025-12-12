// Basic Queue implementation using Array

public class QueueBasics {

    static class Queue {
        int[] arr;
        int size;
        int rear;

        // Constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Check empty
        boolean isEmpty() {
            return rear == -1;
        }

        // Check full
        boolean isFull() {
            return rear == size - 1;
        }

        // enqueue → Add element
        void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            arr[++rear] = data;
        }

        // dequeue → Remove element
        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];

            // shift all elements left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }

        // peek → front element
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    // Testing the queue
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.peek());     // 10
        System.out.println(q.dequeue());  // 10
        System.out.println(q.peek());     // 20
    }
}
