import java.util.*;

public class SpiralMatrix_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if(matrix.length==0){
            return res;
        }


        int left =0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int top = 0;
        int count = (right+1)*(bottom+1);
        while(count>0){
            for(int i=left;i<=right&&count>0;i++,count--){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom&&count>0;i++,count--){
                res.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left&&count>0;i--,count--){
                res.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top&&count>0;i--,count--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
