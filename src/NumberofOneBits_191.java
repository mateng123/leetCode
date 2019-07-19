
public class NumberofOneBits_191 {

    public int hammingWeight(int n) {
        int res =0;
        for(int i=0;i<32;i++){
            int temp = n>>i;
            res += 1&temp;
        }
        return res;
    }
}
