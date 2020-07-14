public class SinglyLinkedList {
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
    void insertAt(int data, int key) {
        Node node = head;
        Node n = new Node();
        n.data = data;
        if(node == null) System.out.println("List is empty");
        else {
            while(node.next != null && node.data != key) {
                node = node.next;
            }
            if(node.data == key) {
                n.next = node.next;
                node.next = n;
            }
            else System.out.println("Key not found");
        }
    }
    void deleteAtBeginning() {
        Node node = head;
        if(node == null) {
            System.out.println("This is an empty link");
        }
        else {
            node = head.next;
            head = node;
        }
    }
    void delete() {
        Node node = head;
        Node prevNode = null;
        if(node == null) {
            System.out.println("This is an empty list");
        }
        else {
            while(node.next != null) {
                prevNode = node;
                node = node.next;
            }
            prevNode.next = null;
        }
    }
    void deleteAt(int key) {
        Node node = head;
        Node prevNode = head;
        if(node == null) System.out.println("This is empty list");
        else {
            while(node.next != null && node.data != key) {
                prevNode = node;
                node = node.next;
            }
            if(prevNode == head) {
                head = head.next;
            }
            if(node.data == key) {
                prevNode.next = node.next;
            }
        }
    }
    void show() {
        Node node = head;
        if(head == null) {
            System.out.println("This is empty");
        }
        else {
            while(node.next != null) {
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.print(node.data);
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.show();
        list.insert(30);
        list.insert(50);
        System.out.println();
        list.show();
        list.insertAtBeginning(200);
        list.insertAtBeginning(100);

        System.out.println();
        list.show();
        System.out.println();
        list.deleteAtBeginning();
        list.show();
        System.out.println();
        list.delete();
        list.show();
        System.out.println();
        list.delete();
        list.show();
        list.insertAt(55,10);
        System.out.println();
        list.show();
        list.insertAt(23,15);
        list.insertAt(125,55);
        System.out.println();
        list.show();
        list.deleteAt(125);
        System.out.println();
        list.show();
        list.deleteAt(200);
        System.out.println();
        list.show();
        list.deleteAt(20);
        System.out.println();
        list.show();
        list.insertAt(333, 10);
        System.out.println();
        list.show();
    }
}
class Node {
    int data;
    Node next;
}
