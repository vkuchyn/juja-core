package ua.com.juja.study.core.presentation.collections;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/13/14
 * Time: 12:09 PM
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Set<MapKey> hashSet = new TreeSet<>();

        MapKey key3 = new MapKey(3);
        hashSet.add(key3);
        MapKey key1 = new MapKey(1);
        hashSet.add(key1);
        MapKey key2 = new MapKey(2);
        hashSet.add(key2);
        hashSet.add(null);

        System.out.println(hashSet);
        System.out.println("KeySet=" + hashSet);
    }
}

class MapKey implements Comparable<MapKey>{
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

    @Override
    public String toString() {
        return "key" + key;
    }

    @Override
    public int compareTo(MapKey o) {
        return o.key - key;
    }
}
