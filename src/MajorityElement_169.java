import java.util.*;

public class MajorityElement_169 {

    //炫酷的选举法
//    public int majorityElement(int[] nums) {
//        int res = nums[0];
//        int time=1;
//        for(int i=1;i<nums.length;i++){
//
//            time += (res==nums[i] ? 1:-1);
//
//            if(time==0){
//                res = nums[i+1];
//            }
//        }
//        return res;
//    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num) == false) {
                map.put(num, 0);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int maxValue = 0;
        int maxNum = nums[0];

        for (int key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxNum = key;
            }
        }
        return maxNum;
    }
}
