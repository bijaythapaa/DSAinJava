package queue;

import java.util.NoSuchElementException;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/8/21 - 8:11 AM
 */
public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == queue.length - 1) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
//        added employee at the back of the queue.
        queue[back] = employee;
        if (back < queue.length - 1) back++;
        else back = 0;
//        and incremented the back position.
//        back++;
    }

    public Employee remove() {
        if (size() == 0) throw new NoSuchElementException();
        Employee employee = queue[front];
        queue[front] = null;
        front++;
//        if the queue is empty then, we can set back and front to 0.
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0) throw new NoSuchElementException();
        return queue[front];
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

    public int size() {
        return back - front;
    }
}
