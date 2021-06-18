package DataStructures.LinkedList;

public class ListNode<T> {
    private T element;
    private ListNode<T> next;

    public ListNode(T element){
        this.element = element;
    }

    public ListNode(T element, ListNode<T> next){
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}