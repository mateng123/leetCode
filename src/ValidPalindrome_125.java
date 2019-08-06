
public class ValidPalindrome_125 {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (j > i) {
            while (j > i && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (j > i && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (i < j && Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
