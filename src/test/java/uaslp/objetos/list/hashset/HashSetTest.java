package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class HashSetTest {
    @Test
    public void givenANewSet_whenSize_thenResultIsZero(){
        //Given
        HashSet<String> hash = new HashSet<>();
        //When
        int size = hash.size();
        //Then
        Assertions.assertEquals(0, size, "size of hashset after creation must be zero");
    }
    @Test
    public void givenNewSet_whenAddAnElement_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        //When
        hash.add("Hola");
        //Then
        Assertions.assertEquals(1, hash.size());
    }

    @Test
    public void givenASetWithOneElement_whenAddAnElement_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");
        //When
        hash.add("Mundo");
        //Then
        int size = hash.size();
        Assertions.assertEquals(2, size, "size of hashset after creation must be two");
        Assertions.assertTrue(hash.contains("Mundo"));
    }

    @Test
    public void givenASetWithOneElement_whenAddSameElement_thenSizeIsNotChange() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash= new HashSet<>();
        hash.add("Hola");
        //When
        hash.add("Hola");
        //Then
        Assertions.assertEquals(1, hash.size());
    }

    @Test
    public void givenASetWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");
        //When
        hash.remove("Hola");
        //Then
        int size = hash.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenASetWith2Element_whenNotFindTheElement_thenResultIsFalse() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");
        hash.add("Mundo");
        //When
        boolean result = hash.contains("Pato");
        //Then
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenASetWith2Element_whenFindTheElement_thenResultIsTrue() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");
        hash.add("Mundo");
        //When
        boolean result = hash.contains("Hola");
        //Then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenAListWith3Elements_whenIterator_thenSecondTextIsIterator() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Adios");
        hash.add("Mundo");
        hash.add("bye");
        //When
        hash.iterator();
        //Then
        //Assertions.assertEquals("Adios", hash.iterator().next());
    }

    @Test
    public void givenASetWith2Element_whenAddAnElement_thenHashSetIsReorganize() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Agua");
        hash.add("Chile");
        hash.add("Mole");
        //When
        //hash.add("Pozole");
        //Then
        int size = hash.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenAEmptyList_whenIterator_thenNextThrowsNotSuchElementException() throws NotValidIndexException {
        //Given
        HashSet<String> hash= new HashSet<>();
        //When
        hash.iterator();
        //Then
        Assertions.assertThrows(NotSuchElementException.class,()->hash.iterator().next());

    }
}
