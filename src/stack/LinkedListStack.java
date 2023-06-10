package stack;

/**
 * @author : bijay.thapa
 * @created : 5/30/23, Tuesday
 * @Description :
 **/
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedListStack {
    private Node head;
    private int size;

    public LinkedListStack() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        // return size == 0;
        return size == 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedValue = head.value;
        head = head.next;
        size--;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return head.value;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();  // Output: 30, 20, 10

        int poppedValue = stack.pop();
        System.out.println("Popped value: " + poppedValue);  // Output: Popped value: 30

        System.out.println("Peeked value: " + stack.peek());  // Output: Peeked value: 20

        stack.printStack();  // Output: 20, 10
    }
}
