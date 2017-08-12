import java.util.ArrayList;
import java.util.Arrays;
public class NewClass4
{
    public static void main(String[] args)
    {
        
        //Input List
        ArrayList<String> inputList=new ArrayList(Arrays.asList(new String[]
        {"a","b","c","Vikram","a","b","c","Vikram","s","d"}));
        
        // inputList - used as input List
        // listNames -  string to store all list values 
        String listNames="";
        listNames = inputList.stream().map((temp) -> temp+"Vikram").
                reduce(listNames, String::concat);
        //Processing output List
        ArrayList<String> outputList=new ArrayList(Arrays.asList
        (listNames.split("(Vikram)+")));
        // outputList - contains your desired data  
        
        
        //Printing output List
        System.out.println(outputList);
        
        
        
    }
    
}
