package uaslp.objetos.list;

//nuevo
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public interface List<T> {
    //no es necesario poner public
    //EN VEZ DE LA T ESTABA UN String
    void addAtTail(T data) throws NotNullValuesAllowedException;
    void addAtFront(T data) throws NotNullValuesAllowedException;
    void remove(int index) throws NotValidIndexException;
    void removeAll();
    /**
     * @param index
     * @param data
     */
    void setAt(int index, T data)  throws NotValidIndexException, NotNullValuesAllowedException;
    /**
     *
     * @param index
     * @return
     * @throws NotValidIndexException
     */
    T getAt(int index)throws NotValidIndexException;
    int getSize();
    Iterator<T> getIterator();
    //CADA T ES INDEP
}
