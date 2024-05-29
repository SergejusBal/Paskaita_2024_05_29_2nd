import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_AddBook {


    static DigitalLibrary digitalLibrary;

    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();

    }

    @Test
    public void addBook_TestAddWithBookName_returnsVoid() {
        //Arrange
        String BookName = "MyBook";
        int expectedListSize = digitalLibrary.getAllBooks().size() + 1;
        //Assert
        digitalLibrary.addBook(BookName);
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }

    @Test
    public void addBook_TestwithNullValue_returnsVoid() {
        //Arrange
        String BookName = null;
        int expectedListSize = digitalLibrary.getAllBooks().size();
        //Assert
        digitalLibrary.addBook(BookName);
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }



}
