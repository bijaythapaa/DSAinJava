package stack;

import java.util.LinkedList;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/1/21 - 12:06 PM
 */
public class LinkedStack {

    private LinkedList<Employee> stack;

    LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
//        ListIterator<Employee> iterator = stack.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        for (Employee employee : stack) {
            System.out.println(employee);
        }
    }
}
