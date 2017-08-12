package trash;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class NewClass1
{
    public static void main(String[] args) 
    {
        ArrayList o=new ArrayList();
        o.add("aAaA");
        o.add("AaA");
        o.add("aAa");
        o.add("AAaa");
        Collections.sort(o);
        System.out.println(o);
        
    }
}
