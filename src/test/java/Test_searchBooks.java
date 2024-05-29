import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_searchBooks {

    static DigitalLibrary digitalLibrary;

    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();
    }

    @Test
    public void searchBook_TestIfCorrectBookIsReturned_returnsLIST() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        String BookName3 = "MyBook3";
        String expectedBook =  BookName1;
        digitalLibrary.addBook(BookName1);
        digitalLibrary.addBook(BookName2);
        digitalLibrary.addBook(BookName3);
        //Assert
        String actualBook = digitalLibrary.searchBooks(BookName1).getFirst();
        //Act
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void searchBook_TestIfReturnCorrectAmount_returnsList() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        digitalLibrary.addBook(BookName1);
        digitalLibrary.addBook(BookName2);
        digitalLibrary.addBook(BookName2);
        int expectedsize = 2;
        //Assert
        int actualsize = digitalLibrary.searchBooks(BookName1).size();
        //Act
        assertEquals(expectedsize, actualsize);
    }

}
