public class SpiralMatrix_II_59 {

    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int sum = n * n;
        int num = 1;
        int ret[][] = new int[n][n];
        while (num <= sum) {

            for (int i = l; i <= r; i++) {
                ret[t][i] = num;
                num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                ret[i][r] = num;
                num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                ret[b][i] = num;
                num++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                ret[i][l] = num;
                num++;
            }
            l++;
        }
        return ret;
    }
}
