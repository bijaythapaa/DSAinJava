package stack;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/1/21 - 10:25 AM
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("Bijay", "Thapa", 124));
        stack.push(new Employee("Ramesh", "Bhandari", 125));
        stack.push(new Employee("Amar", "Kuinkel", 126));
        stack.push(new Employee("Rajan", "Kunwor", 127));
//        stack.printStack();
        System.out.println(stack.peek());
//        stack.printStack();
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        Employee vijay = new Employee("Vijay", "Thapa", 123);
        Employee jane = new Employee("Jane", "Jones", 124);
        Employee ramesh = new Employee("Ramesh", "Bhandari", 125);
        Employee amar = new Employee("Amar", "Kuinkel", 126);
        Employee rajan = new Employee("Rajan", "Kunwor", 127);

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(vijay);
        linkedStack.push(jane);
        linkedStack.push(ramesh);
        linkedStack.push(amar);
        linkedStack.push(rajan);
//        linkedStack.printStack();
//        System.out.println(linkedStack.peek());
//        linkedStack.printStack();
        System.out.println("Popped: " + linkedStack.pop());
        System.out.println(linkedStack.peek());

    }
}
