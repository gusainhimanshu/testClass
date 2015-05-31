
package com.himanshu.exception.tryfinally;

/**
 * This code shows :
 * 1) The finally block is executed even after returning from the 
 * try block.
 * 2) The return statement of finally block is executed even if you have return 
 * statement in the try block
 * 3) After exception gets caught, rest of the code is not executed in the try
 * block
 * @author hgusain
 */
public class TryFinally {
    public static void main(String []args){
        Boolean var;
        meth1();
        var=meth2();    /*will get false from the finally block*/
        System.out.println("Value of var: "+ var);
        meth3();
    }
    public static void meth1(){
        try{
            return;
         /*   System.out.println("hello"); /* This is an unreachable statement,
                                        will compile and run successfully
                                        this statement won't get executed */
        }finally{
            System.out.println("world");
        }
    }
    public static boolean meth2(){
        try{
            return true;
         //   System.out.println("new");
        }finally{
            return false;   
        }
    }
    public static void meth3(){
        int a=0;
        int b=10;
        try{
            a=b/a;
            /*This statement won't get executed*/
            System.out.println("hello world");
        }catch(Exception e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }
}
