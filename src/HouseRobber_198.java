
public class HouseRobber_198 {
    
        public int rob(int[] num) {
            int prevMax = 0;
            int Max = 0;
            for(int i=0;i<=num.length-1;i++){
                int temp = Max;
                Max = Math.max(prevMax + num[i], Max);
                prevMax = temp;
            }
            return Max;
        }
}
