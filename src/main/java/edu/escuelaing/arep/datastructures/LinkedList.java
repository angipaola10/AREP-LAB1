package edu.escuelaing.arep.datastructures;

import java.io.Serializable;
import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>, Serializable {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public LinkedList(){}

    public void add(E e){
        Node<E> node = new Node<>(e);
        if (firstNode == null) {
            setFirstNode(node);
        } else {
            lastNode.setNextNode(node);
        }
        setLastNode(node);
        size++;
    }

    public E get(int index) throws IndexOutOfBoundsException{
        if (index == 0) return firstNode.getData();
        if (index == -1) return lastNode.getData();
        if (index < size) {
            Node<E> currentNode = firstNode;
            for (int i = 1; i <= index; i++){
                currentNode = currentNode.getNextNode();
            }
            return currentNode.getData();
        }
        throw new IndexOutOfBoundsException();
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode){
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode){
        this.lastNode = lastNode;
    }

    public int size() {
        return size;
    }

    public Iterator<E> iterator() {

        return new Iterator<E>() {

            private Node<E> currentNode = firstNode;

            public E next() {
                E currentData = currentNode.getData();
                currentNode = currentNode.getNextNode();
                return currentData;
            }

            public boolean hasNext() {
                return currentNode != null;
            }

        };
    }

}
