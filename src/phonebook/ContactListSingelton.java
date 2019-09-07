/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContactListSingelton {
    private static ContactListSingelton mInstance;
        public static ArrayList<Contact> list = null;

        public static ContactListSingelton getInstance() {
            if(mInstance == null)
                mInstance = new ContactListSingelton();

            return mInstance;
        }
        // private constructor[singleton pattern]
        private ContactListSingelton() {
          list = new ArrayList<>();
        }
 
        // retrieve array from anywhere
        public ArrayList<Contact> getArray() {
         return ContactListSingelton.list;
        }
        //Add element to array
        public void addToArray(Contact contact) {
         ContactListSingelton.list.add(contact);
        }
        public void deleteFromArray(Contact contact)
        {
            ContactListSingelton.list.remove(contact);
        }
        public void searchContact(Contact contact)
        {
            
        }
        public int getSize() {
         return ContactListSingelton.list.size();
        }
    
}
