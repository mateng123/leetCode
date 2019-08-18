import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedArray_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for(int num:nums){
            if(nums[Math.abs(num)-1]>0){
                nums[Math.abs(num)-1] = -nums[Math.abs(num)-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}
