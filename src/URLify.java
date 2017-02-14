/**
 * Created by Ali on 2017-02-13.
 */
public class URLify {
    public static String makeURL(String string,int length){
        String result="";
        for(int i=0;i<string.length();i++){
            if (string.charAt(i)==' '){
                result+="%20";
            }
            else {
                result+=string.charAt(i);
            }
        }
        return result;
    }
    public static void main (String [] args){
        System.out.println(makeURL("wht is this man dawwg",13));
    }
}
