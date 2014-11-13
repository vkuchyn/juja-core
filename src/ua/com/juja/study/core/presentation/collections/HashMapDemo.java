package ua.com.juja.study.core.presentation.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/13/14
 * Time: 12:09 PM
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<MapKey, String> hashMap = new HashMap<>();
        hashMap.put(new MapKey(1), "1");
        hashMap.put(new MapKey(2), "2");
        hashMap.put(new MapKey(3), "3");
    }
}

class MapKey {
    private int key;

    MapKey(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MapKey)) return false;

        MapKey mapKey = (MapKey) o;

        if (key != mapKey.key) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return key;
    }
}
