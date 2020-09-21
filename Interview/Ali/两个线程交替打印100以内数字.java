package Interview.Ali;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/17 19:53
 */
public class 两个线程交替打印100以内数字 {
    // 打印何时结束需要设置一个上限，打印到100结束；
    private static final int MAX = 100;
    private static final AtomicInteger at = new AtomicInteger(1);

    private static void print(){
        new Thread(() ->{
            while(at.get() < MAX){
                if(at.get() % 2 == 1){
                    System.out.println(at.get());
                    at.incrementAndGet();
                }
            }

        }).start();

        new Thread(() ->{
            while(at.get() < MAX){
                if(at.get() % 2 == 0){
                    System.out.println(at.get());
                    at.incrementAndGet();
                }
            }

        }).start();
    }

    public static void main(String[] args){
        print();
    }
}
