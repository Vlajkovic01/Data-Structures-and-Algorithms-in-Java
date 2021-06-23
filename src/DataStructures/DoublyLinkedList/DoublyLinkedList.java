package DataStructures.DoublyLinkedList;

import DataStructures.LinkedList.ListNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements Iterable<T>{
    private DoublyListNode<T> head;
    private DoublyListNode<T> tail;
    private int listSize;

    DoublyListNode<T> getHead(){
        return head;
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public boolean isEmpty() {
        return listSize == 0;
    }

    public int size() {
        return listSize;
    }

    public T getFirst() {
        if(isEmpty()){
            throw new RuntimeException("List is empty!");
        }

        return head.getElement();
    }

    public T getLast(){
        if(isEmpty()){
            throw new RuntimeException("List is empty!");
        }

        return tail.getElement();
    }

    public void addFirst(T element) {
        DoublyListNode<T> newNode = new DoublyListNode<T>(element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        listSize++;
    }

    public void addLast(T element) {
        DoublyListNode<T> newNode = new DoublyListNode<T>(element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        listSize++;
    }

    public void removeFirst() {

        if (isEmpty()) {
            throw new RuntimeException("List is empty!");
        }
        if (head.getNext() == null) {
            head = null;
            tail = null;
            listSize--;
        } else {
            head = head.getNext();
            head.setPrev(null);
            listSize--;
        }
    }

    public void removeLast() {

        if (isEmpty()) {
            throw new RuntimeException("List is empty!");
        }
        if (tail.getPrev() == null) {
            head = null;
            tail = null;
            listSize--;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
            listSize--;
        }
    }

    public void add(int index, T element) {

        DoublyListNode<T> currentNode = head;
        DoublyListNode<T> newNode = new DoublyListNode<T>(element);
        int counter = 0;

        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }
        if (index == listSize) {
            addLast(element);
        } else if (index == 0) {
            addFirst(element);
        } else {
            while (currentNode != null && counter != index) {
                currentNode = currentNode.getNext();
                counter++;
            }

            currentNode.getPrev().setNext(newNode);
            newNode.setPrev(currentNode.getPrev());
            newNode.setNext(currentNode);
            currentNode.setPrev(newNode);

            listSize++;
        }
    }

    public void remove(int index) {

        DoublyListNode<T> currentNode = head;
        int counter = 0;

        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }
        if (index == (listSize-1)) {
            tail = tail.getPrev();
            tail.setNext(null);
            listSize--;
        } else if (index == 0 ) {
            removeFirst();
        } else {
            while (currentNode != null && counter != index) {
                currentNode = currentNode.getNext();
                counter++;
            }

            currentNode.getPrev().setNext(currentNode.getNext());
            currentNode.getNext().setPrev(currentNode.getPrev());
            listSize--;
        }
    }

    public int indexOf(T element){
        if(!isEmpty()){
            DoublyListNode<T> currentNode = head;
            for (int i = 0; i < listSize ; i++) {
                if(currentNode.getElement().equals(element)){
                    return i;
                }
                currentNode = currentNode.getNext();
            }
        }
        return -1;
    }

    public void printBackwards() {
        String s = "{";
        DoublyListNode<T> currentNode = tail;
        while(currentNode != null) {
            s += currentNode.getElement();
            if (currentNode.getPrev() != null) {
                s += ", ";
            }
            currentNode=currentNode.getPrev();
        }
        System.out.println(s + "}");
    }
    // this is printFowards
    @Override
    public String toString() {
        String s = "{";
        DoublyListNode<T> currentNode = head;
        while(currentNode != null) {
            s += currentNode.getElement();
            if (currentNode.getNext() != null) {
                s += ", ";
            }
            currentNode = currentNode.getNext();
        }
        return s + "}";
    }

    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator<T>(this);
    }
}
