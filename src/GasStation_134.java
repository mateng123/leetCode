
public class GasStation_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int res = 0;
        int curCost = 0;
        int totalCost = 0;
        for (int i=0;i<length;i++){
            totalCost += gas[i]-cost[i];
            curCost += gas[i] - cost[i];
            if (curCost<0){
                res = i+1;
                curCost = 0;
            }
        }
        return totalCost>=0 ? res: -1;
    }
}
