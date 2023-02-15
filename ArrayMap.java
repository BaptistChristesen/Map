import java.util.*;
//import java.util.ArrayList;

/**
 * Write a description of class ArrayMap here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class ArrayMap<K, V> implements Map<K, V>, Iterable<MapItem<K, V>>
{
    private ArrayList<Item<K, V>> map;
    private int size;
    
    public ArrayMap(){
        map = new ArrayList<Item<K, V>>();
    }
    
    public ArrayMap(int initCapacity){
        map = new ArrayList<Item<K, V>>(initCapacity);
    }
    
    /**
     * Returns the number of entries in this Map.
     */
    public int size(){
        return map.size();
    }

    /**
     * Returns true if this Map is empty; otherwise, returns false.
     */
    public boolean isEmpty(){
        return map.size() == 0;
    }

    /**
     * Returns true if an entry in this Map with key exists;
     * Returns false otherwise.
     * @throws IllegalArgumentException if key is null
     */
    public boolean containsKey(K key){
        return get(key) != null;
    }

    /**
     * Returns true if an entry in this Map with value exists;
     * Returns false otherwise.
     */
    public boolean containsValue(V value){
        for(Item<K,V> temp: map){
            if(temp.getValue().equals(value)){
                return true;
            }
        }
        return false;
    }

    /** 
     * If an entry in this map with a key exists then the value associated 
     * with that entry is returned; otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V get(K key){
        if(key == null){
            throw new IllegalArgumentException("Maps do not allow null keys");
        }
        for(Item<K,V> temp: map){
            if(temp.getKey().equals(key)){
                return temp.getValue();
            }
        }
        return null;
    }

    /** 
     * If an entry in this map with key already exists then the value 
     * associated with that entry is replaced by value and the original
     * value is returned; otherwise, adds the (key, value) pair to the map
     * and returns null. 
     * @throws IllegalArgumentException if key is null
     */
    public V put(K key, V value){
        if(key == null){
            throw new IllegalArgumentException("Maps do not allow null keys");
        }
        Item<K, V> entry = new Item<K, V>(key,value);
        Item<K,V> temp;
        Iterator<Item<K,V>> search = map.iterator();
        while(search.hasNext()){
            temp = search.next();
            if(temp.getKey().equals(key)){
                search.remove();
                map.add(entry);
                return temp.getValue();
            }
        }
        map.add(entry);
        return null;
    }

    /**
     * If an entry in this map with key exists then the entry is removed
     * from the map and the value associated with that entry is returned;
     * otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V remove(K key){
        if(key == null){
            throw new IllegalArgumentException("Maps do not allow null keys");
        }
        Item<K,V> temp;
        Iterator<Item<K,V>> search = map.iterator();
        while(search.hasNext()){
            temp = search.next();
            if(temp.getKey().equals(key)){
                search.remove();
                return temp.getValue();
            }
        }
        return null;
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear(){
        for(int i = 0; i < map.size(); i++){
            map = new ArrayList<Item<K, V>>();
        }
        size = 0;
    }
    
    public Iterator<MapItem<K,V>> iterator(){
        return null;
    }
}
