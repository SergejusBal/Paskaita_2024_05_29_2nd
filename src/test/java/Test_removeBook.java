import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_removeBook {
    static DigitalLibrary digitalLibrary;


    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();
    }

    @Test
    public void remove_TestAddWithBookName_returnsVoid() {
        //Arrange
        String BookName = "MyBook";
        digitalLibrary.addBook(BookName);
        int expectedListSize = digitalLibrary.getAllBooks().size()-1;
        //Assert
        digitalLibrary.removeBook(BookName);
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }

    @Test
    public void addBook_TestWithNoBooks_returnsVoid() {
        //Arrange
        String BookName = "MyBook";
        int expectedListSize = digitalLibrary.getAllBooks().size();
        //Assert
        digitalLibrary.removeBook(BookName);
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }
    @Test
    public void addBook_TestWithBookNotInList_returnsVoid() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        digitalLibrary.addBook(BookName1);
        int expectedListSize = digitalLibrary.getAllBooks().size();
        //Assert
        digitalLibrary.removeBook(BookName2);
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }




}
