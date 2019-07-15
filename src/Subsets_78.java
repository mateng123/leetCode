import java.util.*;

public class Subsets_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backTrack(nums,temp,res,0);

        return res;
    }

    public void backTrack(int[] nums,ArrayList<Integer> temp,List<List<Integer>> res,int first){
        res.add(new ArrayList<Integer>(temp));

        for(int i=first;i<nums.length;i++){
            temp.add(nums[i]);
            backTrack(nums,temp,res,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
