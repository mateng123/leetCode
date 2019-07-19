import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while(n!=1){

            int sum=0;
            while(n!=0){
                int temp = n%10;
                n=n/10;
                sum += temp*temp;
            }
            if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
            }
            n=sum;
        }
        return true;
    }
}
