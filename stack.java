public class stack {
    private int maxSize; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] stackArray; // Array to hold the stack elements

    // Constructor
    public stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize top to -1 (empty stack)
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed element: " + value);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return -1 to indicate failure
        }
        int value = stackArray[top--];
        System.out.println("Popped element: " + value);
        return value;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Test the stack implementation
    public static void main(String[] args) {
        stack stack = new stack(5); // Create a stack of maximum size 5
        stack.push(10); // Pushing elements onto the stack
        stack.push(20);
        stack.push(30);
        stack.pop(); // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}
