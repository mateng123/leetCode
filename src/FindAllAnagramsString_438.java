import java.util.*;
public class FindAllAnagramsString_438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if(p.length()>s.length()){
            return res;
        }
        int cur[] = new int[26];
        int dic[] = new int[26];
        int temp = p.length();

        for(int i=0;i<temp;i++){
            dic[p.charAt(i)-'a'] +=1;
        }

        for(int i=0;i<temp;i++){
            cur[s.charAt(i)-'a'] += 1;
        }
        int begin=0;
        for(int i=temp;i<=s.length();i++){
            if(isSame(cur,dic)) res.add(begin);
            if(i==s.length()){
                break;
            }
            cur[s.charAt(begin++)-'a']--;
            cur[s.charAt(i)-'a']++;
        }
        return res;
    }

    public boolean isSame(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
