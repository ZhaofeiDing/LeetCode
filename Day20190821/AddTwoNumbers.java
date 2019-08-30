package Day20190821;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode ts = new ListNode(0);
        ListNode l1 = new ListNode(9);
        int []a = {9,9,9,9,9,9,9,9,9};
        ListNode l2 = new ListNode(1), temp = l2;
        for(int i = 0;i < a.length;i++){
            temp.next = new ListNode(a[i]);
            temp = temp.next;
        }
        ts = addTwoNumbers(l1,l2);
        while(ts != null){
            System.out.println(ts.val);
            ts = ts.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = l1, q = l2, l = res;
        int avail = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = avail + x + y;
            l.next = new ListNode(sum % 10);
            avail = sum / 10;
            l = l.next;
            if(p != null)
                p = p.next;
            if(q != null)
                q = q.next;
        }
        if(avail > 0){
            l.next = new ListNode(avail);
        }
        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}
