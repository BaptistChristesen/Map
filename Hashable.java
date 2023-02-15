/**
 * This a mock interface created for the purpose of providing an appropriate
 * hashIndex method signature for completing the Data Structures Map projects
 *
 * @author Tom Bredemeier
 * @version January 28, 2018
 */
public interface Hashable<K, V>
{
    /**
     * returns a hash index for a given key
     */
    public int hashIndex(K key);
}
