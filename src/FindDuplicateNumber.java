import java.util.*;
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                return num;
            }else{
                map.put(num,1);
            }
        }
        

        return 0;
    }
}
