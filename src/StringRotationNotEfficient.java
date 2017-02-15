/**
 * Created by Ali on 2017-02-14.
 */
public class StringRotationNotEfficient {
    public static boolean isSubString(String orig,String sub){
        if (orig.contains(sub)) return true;
        else return false;
    }
    public static boolean isStringRotation(String s1, String s2){
        int index1=0,index2=0;
        int count=0;
        String subString="";
        if(s1.length()==s2.length())
        {
            while(index1<s1.length() && index2<s1.length()){
                if(s1.charAt(index1)!=s2.charAt(index2)){
                    count=0;
                    subString+=s2.charAt(index2);
                    index2++;
                }
                else {
                    count++;
                    index1++;
                    index2++;
                }
            }
            if(isSubString(s1,subString)&& subString.length()+count==s1.length()) return true;
            else return false;
        }
        else return false;
    }
    public static void main (String[]args){
        System.out.println(isStringRotation("stackoverflow","ackoverflowst"));
    }
}