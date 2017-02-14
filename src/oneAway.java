/**
 * Created by Ali on 2017-02-13.
 */
public class oneAway {
    public static boolean insertOrRemoveChar(String first, String second){
        String smaller=(first.length()>second.length())? second: first;
        String larger=(first.length()>second.length())? first: second;
        int count=0;
        int i=0,j=0;
        while (i<smaller.length() && j<smaller.length()){
            if(smaller.charAt(i)==larger.charAt(j)){
                i++;
                j++;
            }
            else{
                count++;
                j++;
            }
        }
        if (count<=1) return true;
        else return false;
    }
    public static boolean replaceChar(String first, String second){
        int count=0;
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==second.charAt(i));
            else count++;
        }
        if (count<=1)return true;
        else return false;
    }

    public static void main (String [] args) {
        String first = "whatis";
        String second = "whatisl";
        if(Math.abs(first.length()-second.length())>=2)System.out.println(false);
        else if (first.length() == second.length())
            System.out.println(replaceChar(first, second));
        else
           System.out.print(insertOrRemoveChar(first,second));
    }
}
