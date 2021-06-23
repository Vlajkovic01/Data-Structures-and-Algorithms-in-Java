Doubly Linked List
=======================

## Description
- A Doubly Linked List (DLL) contains an extra pointer, typically called previous pointer, together with next pointer and data which are there in singly linked list.

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/DoublyLinkedList.png" align=center>

- In simple words, a doubly linked list consists of nodes where each node contains a data field and a reference(link) to the next and previous node in the list.

## Results 📊


<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/DoublyLinkedList.gif" align=center>

**Pseudocode**
```java
public class Program {

    public static void main(String[] args) {

        DoublyLinkedList<String> dll = new DoublyLinkedList<>();

        dll.addFirst("1");
        dll.addLast("2");
        dll.addLast("5");
        dll.addFirst("8");

        System.out.print("Print fowards: ");
        System.out.println(dll);
        System.out.print("Print backwards: ");
        dll.printBackwards();
        System.out.println("-------------------------");

        System.out.println("First element: " + dll.getFirst()); // 8
        System.out.println("Index of 5: " + dll.indexOf("5"));
        System.out.println("Last element: " + dll.getLast()); // 5
        System.out.println("----After removing first----");
        dll.removeFirst();
        System.out.println("First element: " + dll.getFirst()); // 1
        System.out.println(dll);
        System.out.println("----After removing last----");
        dll.removeLast();
        System.out.println("Last element: " + dll.getLast()); // 2
        System.out.println(dll);
        System.out.println("----Adding element to index 2----");
        dll.add(2,"9");
        System.out.println("Last element: " + dll.getLast()); // 9
        System.out.println(dll);
        System.out.println("----Removing element at index 2----");
        dll.remove(2);
        System.out.println("Last element: " + dll.getLast()); // 2
        System.out.println(dll);


    }
}
```
