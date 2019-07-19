
public class SumTwoIntegers_371 {

    public int getSum(int a, int b) {
        int and = a&b;
        int but = a^b;

        and = and <<1;
        while((and & but) != 0){
            int temp = and&but;
            temp = temp<<1;
            but=and^but;
            and = temp;
        }
        return and^but;
    }
}
