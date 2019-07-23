import java.util.*;
public class PalindromeLinkedList_234 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head,fast = head.next,preNode = null;
//        while(fast!=null&&fast.next!=null){
//            fast = fast.next.next;
//
//            ListNode nextNode = slow.next;
//
//            slow.next = preNode;
//            preNode = slow;
//            slow = nextNode;
//
//        }
//        ListNode p1 = head.next;
//        ListNode p2 = fast==null ?
//
//    }
}
