import java.util.PriorityQueue;

public class Subsets_78 {


    //用最大堆
//    public int findKthLargest(int[] nums, int k) {
//
//        PriorityQueue<Integer> queue = new PriorityQueue<>(k,(n1,n2)->{
//            return n2-n1;
//        });
//        for(int num:nums){
//            queue.offer(num);
//        }
//        for(int i =0;i<k-1;i++){
//            queue.poll();
//        }
//        return queue.poll();
//    }
}
