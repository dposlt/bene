/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soutezbene;

/**
 *
 * @author 212437054
 */
public class SoutezBene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnect connect = new DBConnect();
        connect.getData();
        connect.getCount();
    }
    
}
