Hash Map
=======================

## Description

-It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.

## Results 📊

<img src="https://github.com/Vlajkovic01/Data-Structures-and-Algorithms-in-Java/blob/main/others/HashMap.gif" align=center>

**Pseudocode**
```java
public class Program {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(5);

        map.put("abc", "123");
        map.put("123", "abc");
        map.put("qwe", "234");

        System.out.println(map.get("abc"));
        System.out.println(map.get("123"));
        System.out.println(map.get("qwe"));
        System.out.println(map.get("abc2"));

        map.put("abc", "456");
        System.out.println(map.get("abc"));
        System.out.println(map.containsKey("qwe"));
        System.out.println(map.containsKey("qwe1"));
        System.out.println(map.containsValue("123"));
        System.out.println(map.containsValue("abc"));

        map.remove("abc");
        System.out.println(map.get("abc"));
    }
}
```
