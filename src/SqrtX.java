
public class SqrtX {

    public int mySqrt(int x) {
        long left =0;
        long right = x/2 +1;
        while(right>left){
            long mid = left + (right-left+1)/2;
            long sqrt = mid*mid;
            if(sqrt>x){
                right=mid-1;
            }else{
                left=mid;
            }

        }
        return (int)left;

    }
}
