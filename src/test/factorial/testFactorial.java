/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.factorial;

/**
 *
 * @author hgusain
 */
public class testFactorial {
    public static void main(String args[]){
        System.out.println("factorial of 5 using recursion in Java is: " + factorial(5)); 
        
        System.out.println("factorial of 6 using iteration in Java is: " + fact(6)); 
    }
    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return (factorial(number-1)* number);
    }
    
    public static int fact(int number){
        int result=1;
        while(number != 0){
            result=result*number;
            number--;
        }
        return result;
    }
}
