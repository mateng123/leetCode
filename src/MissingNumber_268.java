
public class MissingNumber_268 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        for(int num:nums){
            sum = sum-num;
        }
        return sum;
    }
}
