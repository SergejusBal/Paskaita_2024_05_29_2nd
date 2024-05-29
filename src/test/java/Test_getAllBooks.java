import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_getAllBooks {
    static DigitalLibrary digitalLibrary;

    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();
    }

    @Test
    public void getAllBooks_TestWithNotEmptyList_returnsVoid() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        int expectedListSize = digitalLibrary.getAllBooks().size()+2;
        //Assert
        digitalLibrary.addBook(BookName1);
        digitalLibrary.addBook(BookName2);
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }
    @Test
    public void getAllBooks_TestWithEmptyList_returnsVoid() {
        //Arrange
        int expectedListSize = digitalLibrary.getAllBooks().size();
        //Assert
        int actualListSize = digitalLibrary.getAllBooks().size();
        //Act
        assertEquals(expectedListSize, actualListSize);
    }



}
