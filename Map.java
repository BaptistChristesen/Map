/**
 * This interface represents a subset of the official Java Map interface
 * created for the purpose of completing the Data Structures Map projects
 *
 * @author Tom Bredemeier
 * @version January 28, 2018
 */

public interface Map<K, V>
{
    /**
     * Returns the number of entries in this Map.
     */
    public int size();

    /**
     * Returns true if this Map is empty; otherwise, returns false.
     */
    public boolean isEmpty();

    /**
     * Returns true if an entry in this Map with key exists;
     * Returns false otherwise.
     * @throws IllegalArgumentException if key is null
     */
    public boolean containsKey(K key);

    /**
     * Returns true if an entry in this Map with value exists;
     * Returns false otherwise.
     */
    public boolean containsValue(V value);

    /** 
     * If an entry in this map with a key exists then the value associated 
     * with that entry is returned; otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V get(K key);

    /** 
     * If an entry in this map with key already exists then the value 
     * associated with that entry is replaced by value and the original
     * value is returned; otherwise, adds the (key, value) pair to the map
     * and returns null. 
     * @throws IllegalArgumentException if key is null
     */
    public V put(K key, V value);

    /**
     * If an entry in this map with key exists then the entry is removed
     * from the map and the value associated with that entry is returned;
     * otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V remove(K key);

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear();
}
 