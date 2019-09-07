package Test;


import org.junit.Test;
import static org.junit.Assert.*;
import phonebook.PasswordAndNameValidation;


public class PasswordAndNameValidationTest {
   

   @Test
   public void testHasSpecialCharacter() {
       
       String string = "hue1ju";
       boolean expResult = false;
       boolean result = PasswordAndNameValidation.hasSpecialCharacter(string);
       assertEquals(expResult, result);  // if true,then no special characters
      
   }

   
   // Test of validate method, of class PasswordAndNameValidation.
    
   @Test
   public void testValidate() {
       
       String info = "shaylevi";  // the string that we are checking
       String str = "username";  //"str" is for which field we are testing the input like "username" or "password"
       PasswordAndNameValidation instance = new PasswordAndNameValidation();
       boolean expResult = false;
       boolean result = instance.validate(info, str);
       assertEquals(expResult, result); //if outcome is true, then the input is good
       
   }
   
}
