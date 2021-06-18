package linkedlistdoubly;

public class Base {

    public static void main(String[] args) {

        Employee shyam = new Employee("Shyam", "Khan", 1);
        Employee sanjeev = new Employee("Sanjeev", "Singh", 2);
        Employee ram = new Employee("Ram", "Kumar", 3);
        Employee sita = new Employee("Sita", "Dev", 4);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(shyam);
        list.addToFront(sanjeev);
        list.addToFront(ram);
        list.addToFront(sita);

        list.printList();
        System.out.println(list.getSize());

        Employee ramKumarEnd = new Employee("Ram", "Kumar", 5);
        list.addToEnd(ramKumarEnd);

        list.printList();
        System.out.println(list.getSize());

        System.out.println(list.removeFromFront());
        list.printList();
        System.out.println(list.getSize());

        System.out.println(list.removeFromEnd());
        list.printList();
        System.out.println(list.getSize());

//        LinkedListChallenge-One
        Employee harry = new Employee("Harry", "Smith", 6);
        System.out.println(list.addBefore(harry, sanjeev));
        list.printList();
        System.out.println(list.addBefore(new Employee("Someone", "Else", 111), ram));
        list.printList();
    }
}
