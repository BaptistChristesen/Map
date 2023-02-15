
/**
 * Write a description of class Item here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class Item<K, V> implements MapItem<K, V>
{
    private K key;
    private V value;
    
    public Item(K k, V v){
        key = k;
        value = v;
    }
    
    /**
     * Returns the key of this MapItem.
     */
    public K getKey(){
        return key;
    }

    /**
     * Returns the value of this MapItem.
     */
    public V getValue(){
        return value;
    }

    /**
     * Returns a string representing this MapItem.
     */
    public String toString(){
        return "Key : " + key + "nValue: " + value;
    }
}
