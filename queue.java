public class queue {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node front; // Pointer to the front of the queue
    private Node rear; // Pointer to the rear of the queue

    // Constructor
    public queue() {
        front = null;
        rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue an element at the rear of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued element: " + value);
    }

    // Dequeue an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; // Return -1 to indicate failure
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued element: " + value);
        return value;
    }

    // Test the queue implementation
    public static void main(String[] args) {
        queue queue = new queue();
        queue.enqueue(10); // Enqueueing elements
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue(); // Dequeuing elements
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Trying to dequeue from an empty queue
    }
}
