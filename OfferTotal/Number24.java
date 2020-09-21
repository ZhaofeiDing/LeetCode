package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/7 12:10
 */
public class Number24 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }

    //迭代
    public ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    //递归
    public ListNode reverseList2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }

}

