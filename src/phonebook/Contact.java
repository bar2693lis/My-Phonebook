/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Comparator;



public class Contact {

    private String firstName = "Available";
    private String lastName = "Available";
    private String phoneNumber = "Available"; // Key
    private String address = "Available";
    private String sex = "Available";
    private String emailAddress = "Available";
    private String contactType = "Available";

   



    public Contact() { // Default C'tor
    }



    public Contact(String firstName, String lastName, String phoneNumber, String address, String sex, String emailAddress, String contactType) { // C'tor
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.sex = sex;
        this.emailAddress = emailAddress;
        this.contactType = contactType;
    }



    public Contact (Contact newContact){ // Copy C'tor
        this.firstName = newContact.firstName;
        this.lastName = newContact.lastName;
        this.phoneNumber = newContact.phoneNumber;
        this.address = newContact.address;
        this.sex = newContact.sex;
        this.emailAddress = newContact.emailAddress;
        this.contactType = newContact.contactType;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getContactType() {
        return contactType;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
    public static Comparator<Contact> FirstNameComparator = new Comparator<Contact>() 
    {
    @Override
    public int compare(Contact contact1,Contact contact2)
    {
        String FirstName1 = contact1.getFirstName().toLowerCase();
        String FirstName2 = contact2.getFirstName().toLowerCase();
        return FirstName1.compareTo(FirstName2);
    }       
    };
    public static Comparator<Contact> LastNameComparator = new Comparator<Contact>(){
    @Override
    public int compare(Contact contact1,Contact contact2)
    {
        String LastName1 = contact1.getLastName().toLowerCase();
        String LastName2 = contact2.getLastName().toLowerCase();
        return LastName1.compareTo(LastName2);
    }      
    };
}



