import java.util.*;

public class ContainsDuplicate_217 {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) == false) {
                map.put(num, 0);
            } else {
                return true;
            }
        }
        return false;
    }
}
