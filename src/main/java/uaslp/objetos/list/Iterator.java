package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotValidIndexException;

public interface Iterator <T>{
    boolean hasNext();
    short next() throws NotValidIndexException;//String next();
}
