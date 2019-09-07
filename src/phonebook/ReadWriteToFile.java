/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class ReadWriteToFile implements ToFile{
        private String filePath = "";   
	private Contact tempContact;
	private static Scanner x;
	private static boolean check = false;
	
	public void saveRecords(String filePath) //saves all the contacts of a specific user to his/her DataBase
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("phoneIcon.png"));
        this.filePath = filePath+ ".txt";
        ArrayList<Contact> list = ContactListSingelton.getInstance().getArray();
        try
        {
            FileWriter fileWriter = new FileWriter(filePath, true);
                    try
                    {
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        PrintWriter printWriter = new PrintWriter(bufferedWriter);
                for (Contact list1 : list) {
                    tempContact = list1;
                    printWriter.print(tempContact.getFirstName()+ "," +tempContact.getLastName()+ "," +tempContact.getPhoneNumber()+ "," +tempContact.getAddress()+ "," +tempContact.getSex()+ "," +tempContact.getEmailAddress()+ "," +tempContact.getContactType());
                    printWriter.print("\n");
                }
                           
                        printWriter.flush();
                        printWriter.close();
                        
                    }
                    catch (Exception e)
                    {
                    	JOptionPane.showMessageDialog(null,"Record not saved","Error",JOptionPane.INFORMATION_MESSAGE,icon);
                    }
            }
            catch(Exception e)
            {
            	JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.INFORMATION_MESSAGE,icon);
            }
        }

    @Override
    public void saveRecords(String filepath, UserInfo user) {
       
    }
}

