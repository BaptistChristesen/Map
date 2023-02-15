/**
 * This interface represents doubly linked list node
 * created for the purpose of completing the Data Structures Map projects
 *
 * @author Tom Bredemeier
 * @version January 28, 2018
 */

public interface DoublyLinkedNode<K, V> extends MapItem<K, V>
{
    /**
     * Returns the previous (upstream) node.
     */
    public DoublyLinkedNode<K, V> getPrevious();

    /**
     * Sets the previous node.
     */
    public void setPrevious(DoublyLinkedNode<K, V> node);

    /**
     * Returns the next (downstream) node.
     */
    public DoublyLinkedNode<K, V> getNext();

    /**
     * Sets the next (downstream) node.
     */
    public void setNext(DoublyLinkedNode<K, V> node);
}
