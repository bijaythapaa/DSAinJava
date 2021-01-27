package doublylinkedlist;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
		}

		head = node;
		size++;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode removedNode = head;

		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.println(" <=> ");
			current = current.getNext();

		}
		System.out.println("null");
	}

}
