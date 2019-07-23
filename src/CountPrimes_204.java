
public class CountPrimes_204 {

    public int countPrimes(int n) {
        int count=0;
        boolean[] flag = new boolean[n];
        for(int i=0;i<n;i++){
            flag[i]=true;
        }

        for(int i=2;i*i<n;i++){
            if(flag[i]){
                for(int j=i*i;j<n;j+=i){
                    flag[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(flag[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new CountPrimes_204().countPrimes(10);
    }
}
