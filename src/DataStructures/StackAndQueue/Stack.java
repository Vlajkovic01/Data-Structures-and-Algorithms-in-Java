package DataStructures.StackAndQueue;

import DataStructures.LinkedList.LinkedList; //My LinkedList, use your or Java LinkedList

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        try {
            T element = list.getFirst();
            list.removeFirst();
            return element;
        } catch (Exception err) {
            if (this.empty()) {
                throw new RuntimeException("Stack is empty!");
            }
            throw err;
        }
    }

    public T peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean empty() {
        return list.size() == 0;
    }

    public int search(T element) {
        return list.indexOf(element);
    }
}
