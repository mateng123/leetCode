public class SortColors_75 {
    public void sortColors(int[] nums) {
        int left = -1;   //[0..left]为0
        int right = nums.length;  //[right..nums.length()-1]为2
        for(int i=0;i<right;){
            if(nums[i]==2){
                swap(nums,i,--right);
                continue;
            }
            if(nums[i]==0){
                swap(nums,i,++left);
            }
            i++;
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
