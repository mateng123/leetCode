
public class ExcelSheetColumnNumber_171 {

    public int titleToNumber(String s) {
        int res = 0;
        int n = s.length();
        if (n == 0) {
            return res;
        }

        for (int i = 0; i < n; i++) {
            res = res * 26 + (s.charAt(i) - 'A' + 1);
        }
        return res;
    }
}
