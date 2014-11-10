package ua.com.juja.study.core.presentation.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/10/14
 * Time: 11:39 AM
 */
public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map);
        map.put("key1", "value1`");
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("key2", "value2`");
        map1.putAll(map);
        System.out.println(map1);

        System.out.println("Printing keys of map1");
        System.out.println(map1.keySet());

        System.out.println("printing values of map1");
        System.out.println(map1.values());

    }
}
