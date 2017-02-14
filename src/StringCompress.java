/**
 * Created by Anita on 2017-02-13.
 */
public class StringCompress {
    public static String compressString(String string){
        int count=1;
        String result="";
        char prevChar=' ';
        for(int i=0;i<string.length();i++){
            if (i==0)prevChar=string.charAt(i);
            else if (string.charAt(i)==prevChar){
                count++;
            }
            else {
                result += prevChar;
                result += count;
                prevChar = string.charAt(i);
                count = 1;
            }
        }
        result += prevChar;
        result += count;
        if(result.length()<string.length()){
            return result;
        }
        else
            return string;
    }
    public static void main(String [] args){
       System.out.println(compressString("aaaabbdd"));
    }
}
