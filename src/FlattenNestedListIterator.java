import java.util.*;

public class FlattenNestedListIterator implements Iterator<Integer> {

    public interface NestedInteger {

        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    public List<Integer> list;
    public int size = 0;
    public int cur;

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        list = getList(nestedList);
    }

    @Override
    public Integer next() {
        if (cur < size) {
            return list.get(cur++);
        }
        return null;

    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty() && size > cur;
    }

    public List<Integer> getList(List<NestedInteger> nestedList) {
        List<Integer> newList = new LinkedList<>();

        for (NestedInteger temp : nestedList) {
            if (temp.isInteger()) {
                newList.add(temp.getInteger());
                size++;
            } else {
                newList.addAll(getList(temp.getList()));
            }

        }
        return newList;
    }

}
