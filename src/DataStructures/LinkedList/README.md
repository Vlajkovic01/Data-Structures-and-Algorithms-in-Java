Linked List
=======================

## Description
- A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers as shown in the below image:

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/LinkedList.png" align=center>

- In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.

## Results 📊


<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/LinkedList.gif" align=center>

**Pseudocode**
```java
public class Program {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.addFirst("1");
        l.addLast("2");
        l.addFirst("3");
        l.add(1, "4");


        String x = l.getFirst() + l.getLast();
        System.out.println(x);
        l.remove("4");
        System.out.println();
        System.out.println(l.indexOf("14"));

        l.clear();
        for (String s: l) {
            System.out.println(s);
        }
    }
}
```
