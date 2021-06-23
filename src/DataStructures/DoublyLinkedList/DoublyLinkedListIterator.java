package DataStructures.DoublyLinkedList;

import java.util.Iterator;

public class DoublyLinkedListIterator<T> implements Iterator<T> {
    private DoublyListNode<T> currentNode;

    public DoublyLinkedListIterator(DoublyLinkedList<T> list) {
        currentNode = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public T next() {
        T element = currentNode.getElement();
        currentNode = currentNode.getNext();
        return element;
    }
}
