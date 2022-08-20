import java.util.*;
public class lexicographicallyNextString
{
    public static String prCharWithFreq(String s){
        
        if(s == ""){
            return "a";
        }
        
        int i = s.length()-1;
        while(s.charAt(i) == 'z' && i>=0){
            i--;
        }
        
        if(i==-1){
            s+='a';
        }
        
        else{
            s = s.substring(0,i)+(char)((int)(s.charAt(i))+1)+s.substring(i+1);
        }
        return s;
    }
   
    // Driver code
    public static void main (String[] args)
    {
        String str = "samez";
        System.out.print(prCharWithFreq(str));
    }
    
	
}
