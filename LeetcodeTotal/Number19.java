package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/1/21 12:16
 */
public class Number19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp1 = dummy, temp2 = dummy;
        for (int i = 0; i <= n; i++) {
            temp1 = temp1.next;
        }
        while (temp1 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return dummy.next;
    }
}
