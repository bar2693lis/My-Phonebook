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
public interface ToFile {
    public void saveRecords(String filepath, UserInfo user);
    public void saveRecords(String filePath);
}
