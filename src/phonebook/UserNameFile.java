/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UserNameFile implements ToFile{
    UserInfo tempContact = new UserInfo();
    private String filePath;
    @Override
    public void saveRecords(String filepath, UserInfo user) {    //saves user(username+password) to users file
        ImageIcon icon = new ImageIcon(getClass().getResource("phoneIcon.png"));
        try
        {
            this.tempContact= user;
            this.filePath = filepath;
            FileWriter fileWriter = new FileWriter(filePath, true);
                    try
                    {
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        PrintWriter printWriter = new PrintWriter(bufferedWriter);
                        printWriter.print(tempContact.getUserName()+ "," +tempContact.getPassword());
                        printWriter.print("\n");    
                        printWriter.flush();
                        printWriter.close();   
                        JOptionPane.showMessageDialog(null,"Record saved","Contact Saved",JOptionPane.INFORMATION_MESSAGE,icon);    
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
    public void saveRecords(String filePath) {
      
    }
}
    
    

