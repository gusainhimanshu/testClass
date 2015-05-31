/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.BorderFactory;

/**
 *
 * @author hgusain
 */
public class TestTry {
    
    public void test(){
        Scanner scnr = new Scanner(System.in);
    String number = scnr.next();
       try{
        try{
            if (number.length() > 5) {
            throw new IllegalArgumentException();
        }
        Integer.parseInt(number);
        abc:{
            System.out.println("Hye back");
        }
        
        throw new SQLException();
        
        //return true;

        }catch(RuntimeException |SQLException e){
            //e=new NumberFormatException(); // Multi catch parameter is final 
                                            //and cannot be assigned
            System.out.println("value of e: "+ e);
            
        }
        finally{
            System.out.println("Hello world");
        }
       }catch(IllegalArgumentException e){
           e=new NumberFormatException(); //Single catch parameter is not 
                                            //final, will compile and run fine 
                                            //if we uncomment the code
           System.out.println("Hello");
       }
       
    }
    public static void main(String args[]){
        boolean ab;
        //BorderFactory br =new BorderFactory();
        TestTry t = new TestTry();
        t.test();
        //System.out.println(ab);
        
    }
}
