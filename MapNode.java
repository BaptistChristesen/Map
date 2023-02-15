
/**
 * Write a description of class LinkedMap here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class MapNode<K, V> extends Item<K, V> implements DoublyLinkedNode<K, V>
{   
    private DoublyLinkedNode<K, V> previous;
    private DoublyLinkedNode<K, V> next;
    
    public MapNode(K key, V value, DoublyLinkedNode<K, V> previous, DoublyLinkedNode<K, V> next){
        super(key, value);
        this.previous = previous;
        this.next = next;
    }
    
    /**
     * Returns the previous (upstream) node.
     */
    public DoublyLinkedNode<K, V> getPrevious(){
        return previous;
    }

    /**
     * Sets the previous node.
     */
    public void setPrevious(DoublyLinkedNode<K, V> node){
        previous = node;
    }

    /**
     * Returns the next (downstream) node.
     */
    public DoublyLinkedNode<K, V> getNext(){
        return next;
    }

    /**
     * Sets the next (downstream) node.
     */
    public void setNext(DoublyLinkedNode<K, V> node){
        next = node;
    }
}
