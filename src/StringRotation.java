/**
 * Created by Ali on 2017-02-14.
 */
public class StringRotation {
    public static boolean isSubString(String orig,String sub){
        if (orig.contains(sub)) return true;
        else return false;
    }
    public static boolean isStringRotation(String s1, String s2){
        if(isSubString(s2.concat(s2),s1)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        System.out.println(isStringRotation("waterbottle","erbottlewat"));
    }
}
