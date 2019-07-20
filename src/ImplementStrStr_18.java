
public class ImplementStrStr_18 {

    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(haystack.equals("")){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int m=i+1;
                int j=1;
                for(;j<needle.length();){
                    if(m>=haystack.length()){
                        return -1;
                    }
                    if(haystack.charAt(m)==needle.charAt(j)){
                        m++;
                        j++;
                    }else{
                        break;
                    }
                }
                if(j==needle.length()){
                    return i;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        new ImplementStrStr_18().strStr("hello","ll");
    }
}
