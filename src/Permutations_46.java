import java.util.*;

public class Permutations_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int first = 0;
        int n = nums.length;

        ArrayList<Integer> mid = new ArrayList<>();
        for(int num:nums){
            mid.add(num);
        }

        backTrack(n,mid,res,0);
        return res;
    }

    public void backTrack(int n,ArrayList<Integer> mid,List<List<Integer>> res,int first){

        if(first==n){
            res.add(new ArrayList<Integer>(mid));
        }

        for(int i=first;i<n;i++){
            Collections.swap(mid,i,first);
            backTrack(n,mid,res,first+1);
            Collections.swap(mid,i,first);

        }
    }
}
