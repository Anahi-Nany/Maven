package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class ArrayListTest {
    @Test
    public void givenANewList_whenGetSize_thenResultIsZero() {
        //Given:
        ArrayList<String> array = new ArrayList<>();

        //When:
        int sizeOfList = array.getSize();

        //Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero."); //Valida que el tamaño sea 1
    }

    @Test
    public void givenANewList_whenGetAt_thenExceptionIsThrown(){
        //Given:
        ArrayList<String> array = new ArrayList<>();;
        //When:
        array.getAt(0);
        //Assertions.fail("An exception should be thrown getting element zero");
        //Then:
        Assertions.assertEquals(0, array.getSize(), "Size of list after creation must be zero");
    }

    @Test
    public void givenAListWith1Element_whenAddAtFrontAnElement_thenResultIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        //When:
        array.addAtFront("Mundo");

        //Then:
        int size = array.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Mundo", array.getAt(0));
        Assertions.assertEquals("Hola", array.getAt(1));
    }


    @Test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        //When:
        int sizeOfList = array.getSize();

        //Then:
        Assertions.assertEquals(1, sizeOfList);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenAListWith1Element_whenAddAtFront_thenSizeIsTwo() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        //When:
        array.addAtFront("Mundo");

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(2, sizeOfList);
        Assertions.assertEquals("Mundo", array.getAt(0));
        Assertions.assertEquals("Hola", array.getAt(1));
    }
    @Test
    public void givenListWithASingleElement_whenAddAtTailAnElement_thenResultIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> array = new ArrayList<>();

        //When:
        array.addAtTail("Hola");

        //Then:
        int size = array.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenAListWithOneElement_whenAddAtTail_thenSizeIsTwo() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Hola");

        //When:
        array.addAtTail("Mundo");

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(2, sizeOfList);
        Assertions.assertEquals("Hola", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));
    }

    @Test
    public void givenAListWith1Element_whenRemove_thenSizeIsZero() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();
        array.addAtFront("Hola");

        //When:
        array.remove(0);

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(0,sizeOfList);
    }

        ////////////////////////////


    ///2 elementos
    @Test
    public void givenAListWithTwoElements_whenSetAt_thenElementIsModified() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtFront("Adiós");

        //When:
        array.setAt(0,"Hola");

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Hola",array.getAt(0));
        Assertions.assertEquals("Mundo",array.getAt(1));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given:
        ArrayList<String> array=new ArrayList<>();
        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.addAtTail(null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given:
        ArrayList<String> array=new ArrayList<>();
        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.setAt(0,null));
    }

    //3 elementos
    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Adiós");
        array.addAtTail("Mruel");
        array.addAtTail("Mundo");

        //When:
        array.removeAll();

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(0,sizeOfList);
    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenIteratorWorksOverThreeElements() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hundo");
        array.addAtTail("Cruel");
        array.addAtFront("Adios");

        //When:
        Iterator<String> iterator = array.getIterator();

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(3,sizeOfList);
        /*Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adiós",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel",iterator.next());
        Assertions.assertFalse(iterator.hasNext());*/
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtTail("Cruel");
        array.addAtFront("Adiós");

        //When:
        array.remove(1);

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Adiós",array.getAt(0));
        Assertions.assertEquals("Cruel",array.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>(); //Crea un objeto de la lista

        array.addAtFront("Adiós");
        array.addAtTail("Mundo");
        array.addAtTail("Cruel");

        //When:
        array.remove(2);

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Adiós",array.getAt(0));
        Assertions.assertEquals("Mundo",array.getAt(1));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> array = new ArrayList<>();
        array.addAtFront("Hola");
        array.addAtTail("Mundo");
        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->array.setAt(0,null)); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al setAt
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given:
        ArrayList<String> array=new ArrayList<>();
        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.addAtFront(null));
    }

    @Test
    public void givenAListWithTwoElements_whenRemove_thenSizeIsOne() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();
        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //When:
        array.remove(0);

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Mundo",array.getAt(0));
    }


    @Test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> array = new ArrayList<>();
        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        //When:
        array.remove(1);

        //Then:
        int sizeOfList = array.getSize();

        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Hola",array.getAt(0));
    }




}