package DataStructures.LinkedList;

/**
 * Created by emicsip on 2016-10-25.
 */
public class LinkedList {
    private Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while(current != null){
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
