package Interview.Tencent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/26 20:41
 */
public class 第四题两个栈实现队列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < T; i++) {
            String operate = sc.nextLine();
            if (operate.startsWith("add")) {
                String s1 = operate.substring(4);
                int x = Integer.parseInt(s1);
                queue.offer(x);
            } else if (operate.startsWith("peek")) {
                System.out.println(queue.element());
            } else if (operate.startsWith("poll")) {
                queue.poll();
            }
        }
    }
}
