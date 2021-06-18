package queuecircular;

import queue.ArrayQueue;
import queue.Employee;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/8/21 - 8:11 AM
 */
public class Base {
    public static void main(String[] args) {
        queue.Employee shyam = new queue.Employee("Shyam", "Khan", 1);
        queue.Employee sanjeev = new queue.Employee("Sanjeev", "Singh", 2);
        queue.Employee ram = new queue.Employee("Ram", "Kumar", 3);
        queue.Employee sita = new Employee("Sita", "Dev", 4);

        queue.ArrayQueue queue = new ArrayQueue(10);
        queue.add(shyam);
        queue.add(sanjeev);
        queue.add(ram);
        queue.add(sita);
        queue.printQueue();

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        queue.printQueue();
    }
}
