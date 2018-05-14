package collection;

import java.util.HashMap;
import java.util.Map;

public class ListExample {
    public static void main(String[] args) {
        callListExample();
        callMapExample();
    }

    private static void callMapExample() {
        Map hashmap = new HashMap<String, String>();
        hashmap.put("zuhi", "baklol");
        hashmap.put("mj", "smart");

        System.out.println("This is hash map example code");
        String[] keys = {"zuhi", "mj"};
        for (String key : keys) {
            System.out.println(key + " is " + hashmap.get(key));
        }
    }

    private static void callListExample() {
        System.out.println("This is array list example code");
    }
}
