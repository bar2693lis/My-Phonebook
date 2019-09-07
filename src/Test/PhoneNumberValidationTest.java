package Test;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phonebook.PhoneNumberValidation;

/**
 *
 * @author ASUS
 */
public class PhoneNumberValidationTest {
    
    public PhoneNumberValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validate method, of class PhoneNumberValidation.
     */
    @Test
    public void testValidate() {
        
        String PhoneNumber = "0521236540";
        PhoneNumberValidation instance = new PhoneNumberValidation();
        boolean expResult = true;
        boolean result = instance.validate(PhoneNumber);
        assertEquals(expResult, result);
       
    }
    
}