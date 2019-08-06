public class MultiplyStrings_43 {

    public String multiply(String num1, String num2) {


        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int length1 = num1.length();
        int length2 = num2.length();

        int[] res = new int[length1 + length2];


        for (int i = length1 - 1; i >= 0; i--) {
            for (int j = length2 - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                res[i + j] += a * b;
                if (res[i + j] >= 10 && (i + j) != 0) {
                    res[i + j - 1] += res[i + j] / 10;
                    res[i + j] %= 10;
                }
            }
        }
        String ret = "";
        for (int k = 0; k <= res.length - 2; k++) {
            ret += res[k];
        }
        return ret;
    }

    public static void main(String[] args) {
        String a = new MultiplyStrings_43().multiply("4", "4");
        System.out.println(a);
    }
}
