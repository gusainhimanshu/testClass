/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.integer.to.string;

/**
 *
 * @author hgusain
 */

public class Conversion {

    public static void main(String args[]) {
        int i = 123;
        String str1 = "-3456";
        IntegerToString ISob = new IntegerToString();
        StringToInteger SIob = new StringToInteger();
        ISob.convert(i);
       // SIob.convert(str1);
        SIob.convert1(str1);
    }
}
