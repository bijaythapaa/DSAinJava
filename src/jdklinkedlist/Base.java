package jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Base {

    public static void main(String[] args) {

    Employee bishalUpadhyaya = new Employee("Bishal", "Upadhyaya", 1);
    Employee sanjeevRoka = new Employee("Sanjeev", "Roka", 2);
    Employee ramThapa = new Employee("Ram", "Thapa", 3);
    Employee sitaBasnet = new Employee("Sita", "Basnet", 4);
    Employee amarThapa = new Employee("amar", "thapa", "20")

    LinkedList<Employee> empList = new LinkedList<>();
    empList.addFirst(bishalUpadhyaya);
    empList.addFirst(sanjeevRoka);
    empList.addFirst(ramThapa);
    empList.addFirst(sitaBasnet);

    Iterator iter = empList.iterator();
    System.out.println("HEAD ->");
    while (iter.hasNext()) {
        System.out.print(iter.next());
        System.out.print("<==>");
    }
    System.out.println("null");

    // for(Employee employee:empList){
    //     System.out.println(employee);
    // }
        
    }
    
}
