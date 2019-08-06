import java.util.*;

public class GroupAnagrams_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<>();

        for (String str : strs) {
            int[] arr = new int[26];
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a']++;
            }
            String temp = "";
            for (int i = 0; i < 26; i++) {
                temp = temp + arr[i];
            }
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());
            }

            map.get(temp).add(str);
        }

        return new ArrayList(map.values());
    }
}
