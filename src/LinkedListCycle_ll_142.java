public class LinkedListCycle_ll_142 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode pos = null;
        if (head == null || head.next == null) {
            return pos;
        }

        ListNode slow = head;
        ListNode fast = head;

        ListNode temp = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                temp = slow;
                break;
            }
        }

        if (temp == null) {
            return pos;
        }

        pos = head;

        while (pos != temp) {
            pos = pos.next;
            temp = temp.next;
        }

        return pos;
    }
}
