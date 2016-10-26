package DataStructures.LinkedList;

/**
 * Created by emicsip on 2016-10-25.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(16);

        System.out.println(list.toString());
        System.out.println(list.length());

        list.deleteFromHead();
        System.out.println(list.toString());
        System.out.println(list.length());

        System.out.println(list.find(2));

        list.insertAtTail(189);
        System.out.println(list.toString());
    }
}
