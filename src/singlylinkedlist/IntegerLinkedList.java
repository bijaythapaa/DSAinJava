package singlylinkedlist;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/4/21 - 8:27 AM
 */
public class IntegerLinkedList {
    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
