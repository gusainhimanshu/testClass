/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.integer.to.string;

/**
 *
 * @author hgusain
 */
public class IntegerToString {
    public void convert(int num) {
        final int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
                                      99999999, 999999999, Integer.MAX_VALUE };
        final char[] digits = {
        '0' , '1' , '2' , '3' , '4' , '5' ,
        '6' , '7' , '8' , '9' , 'a' , 'b' ,
        'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
        'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
        'o' , 'p' , 'q' , 'r' , 's' , 't' ,
        'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
        StringBuilder sb = new StringBuilder("");
        int quotient=num, remainder,size;
        
        for (int i=0; ; i++){
            if (num <= sizeTable[i]){
                size=i+1;
                break;
            }
        }
        char[] str = new char[size];
        
        for (;;){            
            quotient = num * 52429 >>> (16 + 3);
            remainder = num - ((quotient << 3) + (quotient << 1));
            str[--size]=digits[remainder];
            num = quotient;
            //System.out.println("Test"+ size);
            if (quotient == 0) {
                break;
            }
        }
        System.out.print("After conversion to String: ");
        System.out.println(str);
    }

}
