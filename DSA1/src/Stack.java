public class Stack {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    private int size;

    public Stack() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(int value) {
        if (size == array.length) {
            // Resize the array if it's full
            resizeArray();
        }
        array[size++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();

        // Push elements onto the stack
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack1.pop());

        // Peek at the top element
        System.out.println("Top element: " + stack1.peek());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack1.isEmpty());
    }
}
