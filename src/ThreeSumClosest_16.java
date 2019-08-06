import java.util.*;

public class ThreeSumClosest_16 {

    public int threeSumClosest(int[] nums, int target) {

        int res = 0, temp = Integer.MAX_VALUE;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int first = i + 1, end = n - 1;
            while (first < end) {

                int sum = nums[i] + nums[first] + nums[end];

                if (temp > Math.abs(sum - target)) {
                    temp = Math.abs(sum - target);
                    res = sum;
                }

                if (sum > target) {
                    end--;

                } else if (sum < target) {
                    first++;
                } else {
                    return sum;
                }

            }
        }
        return res;
    }
}
