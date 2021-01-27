package edu.escuelaing.arep.datastructures;

import java.io.Serializable;

public class Node<E> implements Serializable {

    private Node<E> nextNode;
    private E data;

    public Node(E data){
        this.data = data;
    }

    public E getData(){
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNextNode(){
        return nextNode;
    }

    public void setNextNode (Node<E> nextNode){
        this.nextNode = nextNode;
    }

}
