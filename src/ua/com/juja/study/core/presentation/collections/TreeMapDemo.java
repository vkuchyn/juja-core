package ua.com.juja.study.core.presentation.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/13/14
 * Time: 12:26 PM
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<MapKey, String> treeMap = new TreeMap<>();
        treeMap.put(new MapKey(2), "2");
        treeMap.put(new MapKey(1), "1");
    }
}
