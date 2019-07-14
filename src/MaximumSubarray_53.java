public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        int maxLangthNum=nums[0];
        int curNumSum = nums[0];
        for(int i =1;i<nums.length;i++){
            curNumSum += nums[i];
            if(curNumSum<nums[i]){
                curNumSum=nums[i];
            }
            if(maxLangthNum<curNumSum){
                maxLangthNum=curNumSum;
            }
        }
        return maxLangthNum;
    }
}
