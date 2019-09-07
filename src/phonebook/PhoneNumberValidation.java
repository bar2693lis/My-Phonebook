/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author HP
 */
public class PhoneNumberValidation {
    public boolean validate(String PhoneNumber)//this function gets phone number, and checks if the input was entered correctly
    {
        //validate CellPhone number input
        if((PhoneNumber.length()== 10)&&(PhoneNumber.matches("[0-9]+"))&&
            (PhoneNumber.startsWith("050")||PhoneNumber.startsWith("052")||PhoneNumber.startsWith("053")||PhoneNumber.startsWith("054")))
         {
             return true;
         }
        //validate LandLine Phone number input
        else if((PhoneNumber.length()== 9)&&(PhoneNumber.matches("[0-9]+"))&& 
                (PhoneNumber.startsWith("03")|| PhoneNumber.startsWith("04")|| PhoneNumber.startsWith("08")||PhoneNumber.startsWith("09")))
        {
             return true;
        }
        else
        {
            return false;
        }
    }
}
