package DataStructures.LinkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    private ListNode<T> head;
    private ListNode<T> tail;
    private int listSize;


    ListNode<T> getHead(){
        return head;
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public boolean isEmpty() {
        return listSize == 0;
    }

    public void addFirst(T element){
        ListNode<T> newNode = new ListNode<T>(element, head);
        head = newNode;

        if(listSize == 0){
            tail = head;
        }

        listSize++;
    }

    public void addLast(T element){
        ListNode<T> newNode = new ListNode<T>(element);

        if(listSize == 0){
            head = tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        listSize++;
    }

    public void add(int index, T element){
        if(index == 0 && listSize == 0){
            addFirst(element);
            return;
        }

        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        if(index == listSize - 1){
            addLast(element);
            return;
        }

        ListNode<T> currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        ListNode<T> newNode = new ListNode<T>(element, currentNode.getNext());
        currentNode.setNext(newNode);
        listSize++;
    }

    public T getFirst() {
        if(listSize == 0){
            throw new RuntimeException("List is empty!");
        }

        return head.getElement();
    }

    public T getLast(){
        if(listSize == 0){
            throw new RuntimeException("List is empty!");
        }

        return tail.getElement();
    }

    public T get(int index){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        ListNode<T> currentNode = head;

        for (int i = 0; i < index ; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getElement();
    }

    public int indexOf(T element){
        if(listSize != 0){
            ListNode<T> currentNode = head;
            for (int i = 0; i < listSize ; i++) {
                if(currentNode.getElement().equals(element)){
                    return i;
                }
                currentNode = currentNode.getNext();
            }
        }
        return -1;
    }

    public void set(int index, T element){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        ListNode<T> currentNode = head;

        for (int i = 0; i < index ; i++) {
            currentNode = currentNode.getNext();
        }

        currentNode.setElement(element);
    }

    public void removeFirst(){
        if(listSize == 0){
            throw new RuntimeException("List is empty!");
        }

        head = head.getNext();
        listSize--;

        if(head == null){
            tail = null;
        }
    }

    public void removeLast(){
        if(listSize == 0){
            throw new RuntimeException("List is empty!");
        }

        ListNode<T> previousNode = null;
        ListNode<T> currentNode = head;

        while(currentNode.getNext() != null){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if(previousNode == null){
            head = tail = null;
        }
        else{
            previousNode.setNext(null);
            tail = previousNode;
        }

        listSize--;
    }

    public void remove(int index){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        if(index == 0){
            removeFirst();
            return;
        }

        ListNode<T> currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(currentNode.getNext().getNext());

        if(currentNode.getNext() == null){
            tail = currentNode;
        }

        listSize--;
    }

    public void remove(T element){
        if(listSize == 0){
            throw new RuntimeException("List is empty!");
        }

        ListNode<T> previousNode = null;
        ListNode<T> currentNode = head;

        boolean found = false;
        for (int i = 0; i < listSize ; i++) {
            if(currentNode.getElement().equals(element)){
                found = true;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if(found){
            if(previousNode != null){
                previousNode.setNext(currentNode.getNext());

                if(previousNode.getNext() == null){
                    tail = previousNode;
                }
            }else{
                head = head.getNext();

                if(head.getNext() == null){
                    tail = head;
                }
            }

            listSize--;
        }
    }

    public void clear(){
        if (listSize > 0){
            ListNode<T> e = head.getNext();
            while (e != null) {
                ListNode<T> next = e.getNext();
                e.setNext(null);
                e.setElement(null);
                e = next;
            }
            head = tail = null;
            listSize = 0;
        }
    }

    public int size(){
        return listSize;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
}
