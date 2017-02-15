import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ali on 2017-02-13.
 */
public class ZeroMatrix {
    public static void main (String [] args){
        int [ ] [ ] matrix =
                {{ 20, 18, 22, 20, 16 },
                { 18, 20, 18, 0, 20 },
                { 0, 12, 16, 20, 24 },
                { 25, 24, 22,23, 25 }
        };
        ArrayList<Integer>rows=new ArrayList<>();
        ArrayList<Integer>cols=new ArrayList<>();

        // finding the location of the zeros
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        //zeroing rows and columns
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++) {
                if (rows.contains(i)|| cols.contains(j)) {
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
