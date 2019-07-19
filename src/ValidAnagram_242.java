import java.util.*;

public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();

        if(sLength==0&&tLength==0){
            return true;
        }
        if(sLength==0||tLength==0){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<sLength;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int j=0;j<tLength;j++){
            if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }else{
                return false;
            }
        }

        for(int value:map.values()){
            if (value!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new ValidAnagram_242().isAnagram ("anagram","nagaram");
    }
}
