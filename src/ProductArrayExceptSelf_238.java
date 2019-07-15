public class ProductArrayExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p = 1,q=1;
        for(int i=0;i<n;i++){
            res[i] = p;
            p *=nums[i];
        }

        for(int j=nums.length-1;j>0;j--){
            q *= nums[j];
            res[j-1] *= q;
        }
        return res;
    }
}
