public class FirstLinkList {
    Node head;
    void insert(int data) {
        Node n = new Node();
        n.data = data;
        if(head == null)
            head = n;
        else {
            Node node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = n;
        }
    }
    void insertAtBeginning(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) head = node;
        else {
            node.next = head;
            head = node;
        }
    }
    void deleteAtBeginning() {
        Node node = new Node();
        node = head;
        if(node == null) {
            System.out.println("This is an empty link");
        }
        else {
            node = head.next;
            head = node;
        }
    }
    void delete() {
        Node node = new Node();
        Node prevNode = new Node();
        node = head;
        prevNode = node;
        if(node == null) {
            System.out.println("This is an empty list");
        }
        else {
            while(node.next != null) {
                prevNode.next = node;
                node = node.next;
            }
            prevNode.next = null;
            System.out.println(node);
        }
    }
    void show() {
        Node node = head;
        if(head == null) {
            System.out.println("This is empty");
        }
        else {
            while(node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }

    }

    public static void main(String[] args) {
        FirstLinkList list = new FirstLinkList();
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(30);
        list.insert(50);
        list.insertAtBeginning(200);
        list.insertAtBeginning(100);

        list.show();
        list.deleteAtBeginning();
        list.show();
        list.delete();
        list.show();
        list.delete();
        list.show();
    }
}
class Node {
    int data;
    Node next;
}
