package main;

public class Node {
    private Integer value = null;
    private Node link = null;
    public Node(Integer value){
        this.value = value;
    }

    public Node getNext(){
        return this.link;
    }

    public void setNext(Node n){
        this.link = n;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(Integer v){
        this.value = v;
    }
}
