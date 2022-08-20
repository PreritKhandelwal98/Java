import java.util.*;
public class PrintCharacterWithFrequency
{
    public static void prCharWithFreq(String s){
        Map<Character,Integer> demo = new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            if(demo.containsKey(s.charAt(i))){
                demo.put(s.charAt(i),demo.get(s.charAt(i)+1));
            }
            else{
                demo.put(s.charAt(i),1);
            }
        }
        
        for(int i = 0; i < s.length(); i++)
        {
           
            // Print only if this
            // character is not printed
            // before
            if(demo.get(s.charAt(i)) != 0)
            {
                System.out.print(s.charAt(i));
                System.out.print(demo.get(s.charAt(i)) + " ");
                demo.put(s.charAt(i), 0);
            }           
        }
    }
   
    // Driver code
    public static void main(String []args)
    {
       String S = "geeksforgeeks";
       prCharWithFreq(S);
    }
    
	
}
