package main;

public class SinglyLinkedList {
    private Node head = null;

    public Node getHead(){
        return head;
    }

    public void deleteNodeIndex(int index){
        int idx = 0;
        Node tmp = this.head;
        while (idx != index - 1){
            tmp = tmp.getNext();
            idx++;
        }
        Node toDelete = tmp.getNext();
        tmp.setNext(toDelete.getNext());
        System.gc();
    }

    public void insertNodeIndex(Node n, int index){
        int idx = 0;
        Node tmp = this.head;
        while (idx != index - 1){
            tmp = tmp.getNext();
            idx++;
        }
        n.setNext(tmp.getNext());
        tmp.setNext(n);
    }

    public void insertNode(Node n){
        n.setNext(this.head);
        this.head = n;
    }

    public void printList(){
        Node tmp = this.head;
        while (tmp.getNext() != null){
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }
}
