import java.util.HashMap;

/**
 * Created by Ali on 2017-02-12.
 */
public class checkPerm {
    public static boolean isPerm(String first, String second){
        HashMap<Character,Integer>set1=new HashMap<>();
        HashMap<Character,Integer>set2=new HashMap<>();
        if (first.length()!=second.length())
            return false;
        else{
            for(int i =0;i<first.length();i++){
                if (set1.get(first.charAt(i))!=null){
                    set1.put(first.charAt(i),set1.get(first.charAt(i))+1);
                }
                else
                    set1.put(first.charAt(i),1);
            }
            for(int i =0;i<second.length();i++){
                if (set2.get(second.charAt(i))!=null){
                    set2.put(second.charAt(i),set2.get(second.charAt(i))+1);
                }
                else
                    set2.put(second.charAt(i),1);
            }
            for(char i:set1.keySet()){
                if(set1.get(i)==set2.get(i));
                else
                    return false;
            }
        }
        return true;
    }
    public static void main (String [] args){
        System.out.println(isPerm("this a test","test a siht"));
    }
}
