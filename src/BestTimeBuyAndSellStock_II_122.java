public class BestTimeBuyAndSellStock_II_122 {

//    public int maxProfit(int[] prices) {
//
//        int res = 0;
//        int min =0;
//        int max =0;
//
//        int i =0;
//        while(i<prices.length-1){
//            while(i<prices.length-1 && prices[i]>=prices[i+1]){
//                i++;
//            }
//            min = prices[i];
//
//            while(i<prices.length-1 && prices[i]<=prices[i+1]){
//                i++;
//            }
//            max = prices[i];
//
//            res += (max-min);
//        }
//
//
//        return res;
//    }

    //优化
    public int maxProfit(int[] prices) {

        int i=1;
        int res =0;
        while(i<prices.length){
            if(prices[i]>prices[i-1]){
                res += (prices[i]-prices[i-1]);
            }
            i++;
        }
        return res;

    }
}
