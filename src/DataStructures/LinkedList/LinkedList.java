package DataStructures.LinkedList;

/**
 * Created by emicsip on 2016-10-25.
 */
public class LinkedList {
    private Node head;
    private Node tail;

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        newNode.setNextNode(this.head);
        if(this.head != null){
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;

        if(this.tail == null){
            this.tail = newNode;
        }

    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    public int length(){
        int length = 0;
        Node current = this.head;

        while(current != null){
            length ++;
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){
        Node current = this.head;

        while(current != null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
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
