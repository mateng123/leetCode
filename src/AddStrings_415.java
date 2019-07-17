public class AddStrings_415 {

    public String addStrings(String num1, String num2) {

        int length1 = num1.length()-1;
        int length2 = num2.length()-1;

        int carry = 0;
        StringBuilder res = new StringBuilder("");

        while(length1>=0||length2>=0){
            int a =length1>=0 ? num1.charAt(length1) - '0': 0;
            int b = length2>=0 ? num2.charAt(length2) - '0' : 0;

            int total = a+b+carry;
            carry = total/10;
            res.append(total%10);
            length1--;
            length2--;

        }
        if(carry==1){
            res.append(1);
        }
        return res.reverse().toString();

    }
}
