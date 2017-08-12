package trash;


import java.io.File;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass3
{
    public static void main(String[] args)
    {
        Hashtable t=new Hashtable();
        t.put("A", new Integer(3));
        t.put("B", new Integer(2));
        t.put("C", new Integer(8));
        t.remove(new String("A"));
        System.out.println(t);
        
        
    }
    
}
