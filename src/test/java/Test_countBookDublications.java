import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_countBookDublications {
    static DigitalLibrary digitalLibrary;

    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();
    }

    @Test
    public void countBookDublications_TestWithEmptyBookList_returnsVoid() {
        //Arrange
        Map<String, Integer> expectedFrequencyList = new HashMap<>();

        //Assert
        digitalLibrary.countBookDublications();
        Map<String, Integer> actualFrequencyList = ((DigitalLibraryImp)digitalLibrary).getBookFrequencyList();

        //Act
        assertEquals(expectedFrequencyList, actualFrequencyList);
    }

    @Test
    public void countBookDublications_TestWithNotEmptyBookList_returnsVoid() {
        //Arrange
        String bookName1 = "MyBook1";
        String bookName2 = "MyBook2";
        String bookName3 = "MyBook3";

        for(int i = 0 ; i < 5; i++)        digitalLibrary.addBook(bookName1);
        for(int i = 0 ; i < 3; i++)        digitalLibrary.addBook(bookName2);
        for(int i = 0 ; i < 10; i++)        digitalLibrary.addBook(bookName3);

        Map<String, Integer> expectedFrequencyList = new HashMap<>();
        expectedFrequencyList.put(bookName1,5);
        expectedFrequencyList.put(bookName2,3);
        expectedFrequencyList.put(bookName3,10);

        //Assert
        digitalLibrary.countBookDublications();
        Map<String, Integer> actualFrequencyList = ((DigitalLibraryImp)digitalLibrary).getBookFrequencyList();

        //Act
        assertEquals(expectedFrequencyList, actualFrequencyList);
    }






}
