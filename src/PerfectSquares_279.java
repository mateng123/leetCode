import java.util.*;
public class PerfectSquares_279 {

    private class Node{
        private int val;
        private int step;

        public  Node(int val,int step){
            this.val = val;
            this.step = step;
        }
    }

    public int numSquares(int n) {
        boolean[] flag = new boolean[n];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(n,1));
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            for(int i=1;i*i<temp.val;i++){


                if(temp.val-i*i==0){
                    return temp.step;
                }

                if(!flag[temp.val-i*i]){
                    flag[temp.val-i*i]=true;
                    queue.add(new Node(temp.val-i*i,temp.step+1));
                }
            }
        }

        return -1;
    }
}
