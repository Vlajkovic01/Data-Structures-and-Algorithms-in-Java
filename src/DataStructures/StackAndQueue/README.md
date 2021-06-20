Stack and Queue
=======================

## Description Stack

- A stack is a linear data structure in which elements can be inserted and deleted only from one side of the list, called the top. A stack follows the LIFO (Last In First Out) principle, i.e., the element inserted at the last is the first element to come out. The insertion of an element into stack is called push operation, and deletion of an element from the stack is called pop operation. In stack we always keep track of the last element present in the list with a pointer called top.
- The diagrammatic representation of stack is given below:

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/Stack.png" align=center>

## Description Queue

- A queue is a linear data structure in which elements can be inserted only from one side of the list called rear, and the elements can be deleted only from the other side called the front. The queue data structure follows the FIFO (First In First Out) principle, i.e. the element inserted at first in the list, is the first element to be removed from the list. The insertion of an element in a queue is called an enqueue operation and the deletion of an element is called a dequeue operation. In queue we always maintain two pointers, one pointing to the element which was inserted at the first and still present in the list with the front pointer and the second pointer pointing to the element inserted at the last with the rear pointer.
- The diagrammatic representation of queue is given below:

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/Queue.png" align=center>

## Results 📊

Stack Push
<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/StackPush.gif" align=center>

Stack Pop
<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/StackPop.gif" align=center>

Queue Add
<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/QueueAdd.gif" align=center>

Queue Remove
<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/QueueRemove.gif" align=center>

**Pseudocode**
```java
public class Program {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.pop();
        stack.pop(); //List is empty!
    }
}
```
