public class MultiplyStrings_43 {

    public String addStrings(String num1, String num2) {

        int length1 = num1.length();
        int length2 = num2.length();
        int min = length1>length2 ? length2 : length1;

        int max = length1>length2 ? length1 : length2;
        int i=0;
        int sum=0;
        int temp=1;
        while(i<min){

            sum = (num1.charAt(i)-'0')+(num2.charAt(i)-'0')*temp;
            temp *= 10;
            i++;
        }
        String tempString;
        if(length1>length2){
            tempString=num1;
        }else{
            tempString=num2;
        }

        while(i<max){
            sum = (tempString.charAt(i))*temp;
            temp*=10;
            i++;
        }
        StringBuilder res = new StringBuilder(sum);
        return res.toString();
    }

    public static void main(String[] args) {

        String string1 = "123";
        String string2 = "456";
        System.out.println(new MultiplyStrings_43().addStrings(string1,string2));
    }
}
