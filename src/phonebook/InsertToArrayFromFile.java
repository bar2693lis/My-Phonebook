/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class InsertToArrayFromFile {
           private String filePath = ""; 
    private static Scanner scanner;
    
   // public void InsertToArrayFromFile()
            public void InsertToArrayFromFile(String filePath)   //loads the data from the DataBase of specific user file to an array of contacts
    {
        this.filePath = filePath;
        Contact tempContact = new Contact();

        tempContact.setFirstName("");
        tempContact.setLastName("");
        tempContact.setPhoneNumber("");
        tempContact.setAddress("");
        tempContact.setSex("");
        tempContact.setEmailAddress("");
        tempContact.setContactType("");

        try
        {
            ArrayList<Contact> list = ContactListSingelton.getInstance().getArray();
            File file = new File(filePath);
            scanner = new Scanner(file);
            scanner.useDelimiter("[,\n]");
            
            while(scanner.hasNext())
            {
                
                tempContact.setFirstName(scanner.next());
                tempContact.setLastName(scanner.next());
                tempContact.setPhoneNumber(scanner.next());
                tempContact.setAddress(scanner.next());
                tempContact.setSex(scanner.next());
                tempContact.setEmailAddress(scanner.next()) ;
                tempContact.setContactType(scanner.next());
                Contact new_contact=new Contact(tempContact.getFirstName(),tempContact.getLastName(),tempContact.getPhoneNumber(),tempContact.getAddress(),tempContact.getSex(),tempContact.getEmailAddress(),tempContact.getContactType());
                list.add(new_contact);
               
                
            }
            
        }catch(Exception e)
            {
            	JOptionPane.showMessageDialog(null,"File not found");
            }
        scanner.close();
        File file = new File(filePath);
        file.delete();
    }
    
}
