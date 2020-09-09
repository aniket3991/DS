package practice;

public class DoublyLinkedList {
    Node1 head;
    //Node1 tail;

    void insert(int data) {
        Node1 n = new Node1(data);
        if(head == null) head = n;
        else {
            Node1 node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = n;
            n.previous = node;
        }
    }
    void display() {
        Node1 node = head;
        if(node == null) System.out.println("This is empty");
        else {
            while(node.next != null){
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.print(node.data);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(22);
        list.insert(25);
        list.display();
        list.insert(105);
        list.display();
    }
}
class Node1 {
    int data;
    Node1 next;
    Node1 previous;
    Node1(int data) {
        this.data = data;
    }
}
