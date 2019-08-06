public class IntersectionTwoLinkedLists_160 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = 0;
        int lengthB = 0;
        ListNode curA = headA;
        ListNode curB = headB;

        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }

        if (lengthA > lengthB) {
            int x = lengthA - lengthB;
            while (x > 0) {
                headA = headA.next;
                x--;
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        } else {
            int x = lengthB - lengthA;
            while (x > 0) {
                headB = headB.next;
                x--;
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headB;
        }

    }
}
