package main;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
	    for(int i = 0; i<= 100; ++i){
	        Node node = new Node(i);
	        list.insertNode(node);
        }
	    list.insertNodeIndex(new Node(999), 1);
        list.printList();
	    list.deleteNodeIndex(1);
	    list.printList();
    }
}
