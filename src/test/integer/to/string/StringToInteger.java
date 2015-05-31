/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.integer.to.string;

/**
 *
 * @author hgusain
 */
public class StringToInteger {
    
    public void convert(String str){
        int len=str.length();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            arr[i]=(ch-'0');
        }
        System.out.print("After conversion to int: ");
        for(int i=0;i<len;i++){
                    System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public void convert1(String str){
        
        boolean isNegative =false;
        
        //If number is negative
        if(str.charAt(0) != '-'){
            convert(str);
            return;
        }
        int len=str.length();
        int i=1,num=0;
        while(i<len){
            num*=10;
            num+=(str.charAt(i)-'0');
            i++;
        }
        System.out.println("in convert1: -"+ num);
    }
}
