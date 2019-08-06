public class MergeTwoSortedLists_21 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //迭代写法
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode res = new ListNode(0);
//        ListNode cur = res;
//
//
//
//        while(l1!=null || l2!=null){
//            if(l1==null){
//                cur.next = l2;
//                break;
//            }
//            if(l2 == null){
//                cur.next = l1;
//                break;
//            }
//
//            if(l1.val<l2.val){
//                cur.next = l1;
//                l1 = l1.next;
//            }else{
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        return res.next;
//    }

    //递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }


    }
}
