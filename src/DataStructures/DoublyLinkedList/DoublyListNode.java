package DataStructures.DoublyLinkedList;

public class DoublyListNode<T> {

    private T element;
    private DoublyListNode<T> prev;
    private DoublyListNode<T> next;

    public DoublyListNode(T element){
        this.element = element;
    }

    public DoublyListNode(T element, DoublyListNode<T> prev, DoublyListNode<T> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public DoublyListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyListNode<T> prev) {
        this.prev = prev;
    }

    public DoublyListNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyListNode<T> next) {
        this.next = next;
    }
}