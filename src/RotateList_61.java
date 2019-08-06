public class RotateList_61 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        int move = length - k;

        ListNode mid = head;
        for (int i = 1; i < move; i++) {
            mid = mid.next;
        }

        ListNode ret = null;

        if (mid == null || mid.next == null) {
            return head;
        } else {
            ret = mid.next;
        }


        tail.next = head;
        mid.next = null;
        return ret;


    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        new RotateList_61().rotateRight(node1, 2);
    }
}
