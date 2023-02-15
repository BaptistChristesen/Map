/**
 * This interface represents a key-value pair for use in Map objects
 * created for the purpose of completing the Data Structures Map projects
 *
 * @author Tom Bredemeier
 * @version January 28, 2018
 */

public interface MapItem<K, V>
{
    /**
     * Returns the key of this MapItem.
     */
    public K getKey();

    /**
     * Returns the value of this MapItem.
     */
    public V getValue();

    /**
     * Returns a string representing this MapItem.
     */
    public String toString();
}
 