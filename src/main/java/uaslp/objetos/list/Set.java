package uaslp.objetos.list;


import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public interface Set<T> {
    /**
     * Adds an element to the set
     *
     * @param element Element to be added to the set
     */
    void add(T element) throws NotValidIndexException, NotNullValuesAllowedException;

    /**
     * removes an element from the set
     *
     * @param element Element to be removed from the set
     */
    void remove(T element) throws NotValidIndexException;

    /**
     * @param element Element to search into the set
     * @return true if element exists, otherwise false
     */
    boolean contains(T element) throws NotValidIndexException;

    /**
     * @return an iterator to move through the elements of the set
     */
    Iterator<T> iterator();

    /**
     *
     * @return number of elements inserted to the set
     */
    int size();

}