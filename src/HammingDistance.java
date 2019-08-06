
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int temp = x ^ y;
        int res = 0;
        int mid = 1;
        for (int i = 0; i < 32; i++) {
            res += (mid & temp);
            temp = temp >> 1;
        }
        return res;
    }
}
