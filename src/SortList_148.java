public class SortList_148 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        ListNode p = sortList(head);
        ListNode q = sortList(temp);

        ListNode h = new ListNode(0);
        ListNode res = h;

        while (p != null && q != null) {
            if (p.val < q.val) {
                h.next = p;
                h = h.next;
                p = p.next;
            } else {
                h.next = q;
                h = h.next;
                q = q.next;
            }

        }
        h.next = p == null ? q : p;
        return res.next;
    }
}
