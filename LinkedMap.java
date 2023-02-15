/**
 * Write a description of class LinkedMap here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class LinkedMap<K, V> implements Map<K, V>
{
    private DoublyLinkedNode<K, V> head;
    private int size;
    
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
        if(key == null){
            throw new IllegalArgumentException("Maps do not allow null keys");
        }
        DoublyLinkedNode<K, V> current = head;
        while(current != null){
            if(current.getKey().equals(key)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * Returns true if an entry in this Map with value exists;
     * Returns false otherwise.
     */
    public boolean containsValue(V value){
        DoublyLinkedNode<K, V> current = head;
        while(current != null){
            if(current.getValue().equals(value)){
                return true;
            }
            current = current.getNext();
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
        DoublyLinkedNode<K, V> current = head;
        while(current != null){
            if(current.getKey().equals(key)){
                return current.getValue();
            }
            current = current.getNext();
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
        V oldValue = remove(key);
        DoublyLinkedNode<K, V> node = new MapNode(key, value, null, head);
        if(head != null){
            head.setPrevious(node);
        }
        head = node;
        size++;
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
            throw new IllegalArgumentException("Maps do not allow null keys");
        }
        DoublyLinkedNode<K, V> current = head;
        while(current != null){
            if(current.getKey().equals(key)){
                V oldValue = current.getValue();
                if(current.getPrevious() == null){
                    head = head.getNext();
                }
                else{
                    current.getPrevious().setNext(current.getNext());
                }
                if(current.getNext() != null){
                    current.getNext().setPrevious(current.getPrevious());
                }
                current = null;
                size--;
                return oldValue;
            }
            current = current.getNext();
        }
        return null;
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear(){
        head = null;
        size = 0;
    }
}