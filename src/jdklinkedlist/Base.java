package jdklinkedlist;

import java.util.LinkedList;

public class Base {

    Employee bishalUpadhyaya = new Employee("Bishal", "Upadhyaya", 1);
    Employee sanjeevRoka = new Employee("Sanjeev", "Roka", 2);
    Employee ramThapa = new Employee("Ram", "Thapa", 3);
    Employee sitaBasnet = new Employee("Sita", "Basnet", 4);

    LinkedList<Employee> list = new LinkedList<>();
    list.addFirst(bishalUpadhyaya);
    
}
