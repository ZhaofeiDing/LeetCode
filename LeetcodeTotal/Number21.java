package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/5 12:35
 */
public class Number21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode head = new ListNode(-1);
//        ListNode newNode = head;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                newNode.next = l1;
//                l1 = l1.next;
//            } else {
//                newNode.next = l2;
//                l2 = l2.next;
//            }
//            newNode = newNode.next;
//        }
//        newNode.next = l1 == null ? l2 : l1;
//
//        return head.next;
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }

}
