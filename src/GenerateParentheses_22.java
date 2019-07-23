import java.util.*;
public class GenerateParentheses_22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrace(list,"",0,0,n);
        return list;
    }

    public void backTrace(List<String> list,String str,int left,int right,int total){
        if(right==total){
            list.add(str);
            return;
        }
        if(left<total){
            backTrace(list,str+"(",left+1,right,total);
        }
        if(right<left){
            backTrace(list,str+")",left,right+1,total);
        }
    }
}
