import org.example.DigitalLibrary;
import org.example.DigitalLibraryImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_isBookAvailable {

    static DigitalLibrary digitalLibrary;

    @BeforeAll
    public static void paruoštiObjektus() {
        digitalLibrary = new DigitalLibraryImp();
    }

    @Test
    public void IsBookAvailable_AvailableTest_returnsTrue() {
        //Arrange
        String BookName1 = "MyBook1";
        boolean expectedBoolean = true;
        digitalLibrary.addBook(BookName1);
        //Assert
        boolean actualBoolean = digitalLibrary.isBookAvailable(BookName1);
        //Act
        assertEquals(expectedBoolean, actualBoolean);
    }
    @Test
    public void IsBookAvailable_NotAvailableTest_returnsFalse() {
        //Arrange
        String BookName1 = "MyBook1";
        String BookName2 = "MyBook2";
        boolean expectedBoolean = false;
        digitalLibrary.addBook(BookName1);
        //Assert
        boolean actualBoolean = digitalLibrary.isBookAvailable(BookName2);
        //Act
        assertEquals(expectedBoolean, actualBoolean);
    }
}
