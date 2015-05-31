package checkExceptionInSubclasses;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This code tells that in subclass you can only throw the exception equivalent
 * or the lower exception, else it won't even compile.
 * @author hgusain
 */
class Super {
    /*Uncomment the code below and comment the next line to check */
   // public void meth1()throws SQLException{
    public void meth1()throws Exception{
        System.out.println("hello");
    }
}
class Sub extends Super{
    @Override
    /*Uncomment the code below and comment the next line to check*/
    //public void meth1()throws Exception{
    public void meth1()throws SQLException{
        System.out.println("hello 1");
    }
}
public class TestException {
    public static void main(String args[]){
        Super s = new Sub();
        try {
            s.meth1();
        } catch (SQLException ex) {
            Logger.getLogger(TestException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(TestException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
