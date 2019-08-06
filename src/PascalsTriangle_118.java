import java.util.*;

public class PascalsTriangle_118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new LinkedList<>();
        if (numRows == 0) {
            return list;
        }

        list.add(new LinkedList());
        list.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> curList = new LinkedList<>();
            List<Integer> preList = list.get(i - 1);

            curList.add(1);
            for (int j = 1; j < i; j++) {
                curList.add(preList.get(j - 1) + preList.get(j));
            }
            curList.add(1);

            list.add(curList);
        }

        return list;
    }
}
