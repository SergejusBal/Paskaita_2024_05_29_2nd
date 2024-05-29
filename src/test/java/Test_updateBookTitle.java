import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_updateBookTitle {
    static DigitalLibrary digitalLibrary;

    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();
    }

    @Test
    public void updateBookTitle_BooksIsInTheListTest_returnsVoid() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        boolean expectedBoolean = true;
        digitalLibrary.addBook(BookName1);
        //Assert
        boolean actualBoolean = digitalLibrary.updateBookTitle(BookName1,BookName2);
        //Act
        assertEquals(expectedBoolean, actualBoolean);
    }

    @Test
    public void updateBookTitle_BooksIsNotInTheListTest_returnsVoid() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        boolean expectedBoolean = false;
        digitalLibrary.addBook(BookName2);
        //Assert
        boolean actualBoolean = digitalLibrary.updateBookTitle(BookName1,BookName2);
        //Act
        assertEquals(expectedBoolean, actualBoolean);
    }
}
