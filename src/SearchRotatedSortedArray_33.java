public class SearchRotatedSortedArray_33 {

    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;

        if(left==right&&nums[left]==target){
            return left;
        }else if(left==right&&nums[left]!=target){
            return -1;
        }else if(nums.length==0){
            return -1;
        }
        int point=0;

        while(right>=left){
            if(nums[right]>nums[left]){
                point = 0;
                break;
            }
            int mid =(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                point = mid+1;
                break;
            }else{
                if(nums[mid]>nums[left]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }

        if(point==0){
            return briarySerach(nums,0,nums.length-1,target);
        }else if(nums[0]>target){
            return briarySerach(nums,point,nums.length-1,target);
        }else{
            return briarySerach(nums,0,point,target);
        }

    }

    public int briarySerach(int[] nums,int left,int right,int target){

        while(right>=left){
            int mid = (left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }


}
