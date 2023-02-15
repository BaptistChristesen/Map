/**
 * Write a description of class HashMap here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class HashMap<K, V> implements Map<K, V>, Hashable<K, V>
{
    private int size;
    private Map<K, V>[] table;
    
    public HashMap(int capacity){
        table = new LinkedMap[capacity];
        clear();
    }
    
    /**
     * Returns the number of entries in this Map.
     */
    public int size(){
        return size;
    }

    /**
     * Returns true if this Map is empty; otherwise, returns false.
     */
    public boolean isEmpty(){
        return size == 0;
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
        for(Map<K, V> list: table){
            if(list.containsValue(value)){
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
            throw new IllegalArgumentException("Null keys arent allowed noob");
        }
        Map<K, V> list = table[hashIndex(key)];
        return list.get(key);
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
            throw new IllegalArgumentException("Null keys arent allowed noob");
        }
        Map<K, V> list = table[hashIndex(key)];
        V oldValue = list.put(key, value);
        if(oldValue == null){
            size++;
        }
        return oldValue;
    }

    /**
     * If an entry in this map with key exists then the entry is removed
     * from the map and the value associated with that entry is returned;
     * otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V remove(K key){
        if(key == null){
            throw new IllegalArgumentException("Null keys arent allowed noob");
        }
        Map<K, V> list = table[hashIndex(key)];
        V oldValue = list.remove(key);
        if(oldValue != null){
            size--;
        }
        return oldValue;
        
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear(){
        //table = new LinkedMap[capacity];
        for(int i = 0; i < table.length; i++){
            table[i] = new LinkedMap<K, V>();
        }
        size = 0;
    }
    
    public int hashIndex(K key){
        return Math.abs(key.hashCode()) % table.length;
    }
}