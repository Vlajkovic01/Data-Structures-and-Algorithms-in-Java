package DataStructures.HashMap;

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
