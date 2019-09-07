package Test;




//CheckIFEXTIST


/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import phonebook.CheckIfExist;

/**
*
* @author ASUS
*/
public class TestCheckIfExist {
  
	/*
	 * public TestCheckIfExist() { }
	 * 
	 * @BeforeClass public static void setUpClass() { }
	 * 
	 * @AfterClass public static void tearDownClass() { }
	 * 
	 * @Before public void setUp() { }
	 * 
	 * @After public void tearDown() { }
	 */

  /**
   * Test of readFile method, of class CheckIfExist.
   */
  @Test
  public void testReadFile() {
      
      String UserName = "shaylevi";
      String filepath = "user.txt";
      CheckIfExist instance = new CheckIfExist();
      boolean expResult = true;
      boolean result = instance.readFile(UserName, filepath);
      assertEquals(expResult, result);
        
  }
  
}

