package Interview.Tencent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/26 20:40
 */
public class 第一题实现队列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        Queue<Integer> queue;
        for (int i = 0; i < T; i++) {
            String count = sc.nextLine();
            queue = new LinkedList<>();
            for (int j = 0; j < Integer.parseInt(count); j++) {
                String operator = sc.nextLine();
                if(operator.startsWith("PUSH")){
                    String s1 = operator.substring(5);
                    int x = Integer.parseInt(s1);
                    queue.offer(x);
                }else if(operator.startsWith("POP")){
                    if(queue.size() > 0){
                        queue.poll();
                    }else{
                        System.out.println(-1);
                    }
                }else if(operator.startsWith("TOP")){
                    if(queue.size() > 0){
                        System.out.println(queue.element());
                    }else{
                        System.out.println(-1);
                    }
                }else if(operator.startsWith("SIZE")){
                    System.out.println(queue.size());
                }else if(operator.startsWith("CLEAR")){
                    queue.clear();
                }
            }
        }
    }
}
