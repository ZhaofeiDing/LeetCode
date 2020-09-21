package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/19 1:19
 */
public class Number23 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            return null;
        }

        while (len > 1) {
            int i;
            for (i = 0; i < len / 2; i++) {
                lists[i] = mergeTwoLists(lists[i * 2], lists[i * 2 + 1]);
            }

            if (len % 2 != 0) {
                lists[i] = lists[len - 1];
                len++;
            }
            len /= 2;
        }

        return lists[0];

    }

    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        if (L1 == null) {
            return L2;
        } else if (L2 == null) {
            return L1;
        } else if (L1.val <= L2.val) {
            L1.next = mergeTwoLists(L1.next, L2);
            return L1;
        } else {
            L2.next = mergeTwoLists(L1, L2.next);
            return L2;
        }
    }
}
