import java.util.*;

public class LetterCombinationsPhoneNumber_17 {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }

    public void backtrack(String str, String digits) {
        if (digits.length() == 0) {
            output.add(str);
            return;
        } else {
            String nextDigit = digits.substring(0, 1);
            String letters = phone.get(nextDigit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(nextDigit).substring(i, i + 1);
                backtrack(str + letter, digits.substring(1));
            }
        }

    }
}
