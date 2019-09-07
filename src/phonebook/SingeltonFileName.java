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
class SingeltonFileName {
     private static SingeltonFileName myInstance;
        public static String filename = null;

        public static SingeltonFileName getInstance() {
            if(myInstance == null)
                myInstance = new SingeltonFileName();

            return myInstance;
        }
        // private constructor[singleton pattern]
        private SingeltonFileName() {
          
        }
 
        // retrieve filename from anywhere
        public String getfileName() {
         return SingeltonFileName.filename;
        }
        public void setName(String name)
        {
            SingeltonFileName.filename = name;
        }
}
