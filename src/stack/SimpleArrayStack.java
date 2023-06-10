package stack;

/**
 * @author : bijay.thapa
 * @created : 6/10/23, Saturday
 * @Description :
 **/

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
