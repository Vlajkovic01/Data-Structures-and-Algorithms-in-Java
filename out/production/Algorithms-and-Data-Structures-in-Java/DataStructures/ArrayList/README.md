Array List
=======================

## Description
- ArrayList is a part of collection framework and is present in java.util package. It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package.

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/ArrayList.png" align=center>

## Results 📊

**Pseudocode**
```java
public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> testArray = new ArrayList<>();

        testArray.add(5);
        testArray.add(7);
        testArray.add(3);
        testArray.add(9);
        testArray.add(15);
        System.out.println(testArray);

        System.out.println("List size: " + testArray.size());
        System.out.println("List empty: " + testArray.isEmpty());
        System.out.println("Get element on the index 4: " + testArray.get(4));
        System.out.println("Index of element 7: " + testArray.indexOf(7));
        System.out.println("Contains element 3: " + testArray.contains(3));
    }
}
```
