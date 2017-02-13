import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Ali on 2017-02-12.
 */
public class isUnique {
    public static boolean hasUniqueChar(String string){
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<string.length();i++){
            if(set.contains(string.charAt(i))){
                return false;
            }
            else if (string.charAt(i)==' ');
            else
                set.add(string.charAt(i));
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println(hasUniqueChar("al of thes ring q"));
    }
}
