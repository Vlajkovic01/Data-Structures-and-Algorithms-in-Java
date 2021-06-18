package DataStructures.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements Iterable<E> {
    private static final int INIT_SIZE = 10;
    private E[] myArray;
    private int length;

    //Constructors
    public ArrayList() {
        this(ArrayList.INIT_SIZE);
    }

    @SuppressWarnings(value = { "unchecked" })
    public ArrayList(int capacity) {
        this.myArray = (E[]) new Object[capacity];
        this.length = 0;
    }

    //Check if the list is empty or not
    public boolean isEmpty() {
        return length <= 0;
    }

    //Return size of array
    public int size() {
        return length;
    }

    //To increase size of array
    @SuppressWarnings(value = { "unchecked" })
    //Suppress warning on(E[]) casted from Object type
    private void increaseSize() {
        E[] temp = (E[]) new Object[myArray.length + 3];
        for (int i = 0; i < myArray.length; i++) {
            temp[i] = myArray[i];
        }
        myArray = temp;
    }

    //Add element in array
    public void add(int index, E newElement) {
        this.rangeCheck(index, length);
        if (this.length == myArray.length) {
            increaseSize();
        }
        for (int i = length; i > index; i--) {
            myArray[i] = myArray[i - 1];
        }
        myArray[index] = newElement;
        length++;
    }

    public boolean add(E newElement) {
        this.add(this.length, newElement);
        return true;
    }

    //Takes an element on a given index
    public E get(int index) {
        rangeCheck(index, length - 1);
        return myArray[index];
    }

    //Return index of element
    public int indexOf(E element) {
        for (int i = 0; i < length; i++) {
            if (element.equals(myArray[i])) {
                return i+1;
            }
        }
        return -1;
    }

    //Check there is an element in the list
    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    //Remove element
    public void remove(int index) {
        rangeCheck(index, length - 1);
        for (int i = index; i < length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        length--;
    }

    public boolean remove(E element) {
        int index = indexOf(element);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    //Check the range of the list
    private void rangeCheck(int index, int upperBound) {
        if (index < 0 || index > upperBound)
            throw new ArrayIndexOutOfBoundsException("Array index " + index + " out of bound");
    }

    //Iterator interface is implemented
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() { //Anonymous Class
            int nextIndex=-1;

            @Override
            public boolean hasNext() {
                if(nextIndex>=size()-1) return false;
                return true;
            }

            @Override
            public E next() {
                if(nextIndex>=size()-1)throw new NoSuchElementException();
                return myArray[++nextIndex];
            }
            @Override
            public void remove() {
                if(nextIndex<=0)
                    throw new RuntimeException("next() required before calling remove()");
                ArrayList.this.remove(nextIndex-1);
            }
        };
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                ", length=" + length +
                '}';
    }
}