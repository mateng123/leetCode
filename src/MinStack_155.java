import java.util.*;

public class MinStack_155 {

    int size;
    int propity;
    ArrayList<Integer> list;

    /**
     * initialize your data structure here.
     */
    public MinStack_155() {
        list = new ArrayList<>(10);
        size = 0;
    }

    public void push(int x) {
        list.add(x);
        size++;
    }

    public void pop() {
        list.remove(size - 1);
        size--;
    }

    public int top() {
        return list.get(size - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack_155 obj = new MinStack_155();
        obj.push(1);
        obj.push(1);
        obj.push(1);
        obj.getMin();
        obj.pop();
        obj.top();
        obj.getMin();
    }
}
