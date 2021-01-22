package singlylinkedlist;

public class Base {

	public static void main(String[] args) {
		
		Employee bishalUpadhyaya = new Employee("Bishal", "Upadhyaya", 1);
		Employee sanjeevRoka = new Employee("Sanjeev", "Roka", 2);
		Employee ramThapa = new Employee("Ram", "Thapa", 3);
		Employee sitaBasnet = new Employee("Sita", "Basnet", 4);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(bishalUpadhyaya);
		list.addToFront(sanjeevRoka);
		list.addToFront(ramThapa);
		list.addToFront(sitaBasnet);
		
		list.printList();

	}

}
