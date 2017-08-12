/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        new NewClass().doSomeWork();
    }

    private void doSomeWork() throws ClassNotFoundException
    {
        Class c=Class.forName(this.getClass().getName());
        
    }
}
