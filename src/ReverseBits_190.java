
public class ReverseBits_190 {

    public int reverseBits(int n) {
        int result =0;
        for(int i=0;i<32;i++){
            int temp=1;
            temp &= n>>i;
            temp = temp<<(31-i);
            result = result | temp;
        }

        return result;
    }
}
