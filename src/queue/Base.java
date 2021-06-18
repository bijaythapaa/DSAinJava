package queue;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/8/21 - 8:11 AM
 */
public class Base {
    public static void main(String[] args) {
        Employee shyam = new Employee("Shyam", "Khan", 1);
        Employee sanjeev = new Employee("Sanjeev", "Singh", 2);
        Employee ram = new Employee("Ram", "Kumar", 3);
        Employee sita = new Employee("Sita", "Dev", 4);

        ArrayQueue queue = new ArrayQueue(10);
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
