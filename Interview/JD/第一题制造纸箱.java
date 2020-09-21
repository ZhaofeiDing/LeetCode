package Interview.JD;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/18 19:49
 */

public class 第一题制造纸箱 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
//        int[][] zushu = new int[3][3];
//        int[] nums = new int[3];
        for (int i = 0; i < T; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < 6; j++) {
                int h = sc.nextInt();
                if (map.containsKey(h)) {
                    int value = map.get(h);
                    map.put(h, ++value);
                } else {
                    map.put(h, 0);
                }
                int w = sc.nextInt();
                if (map.containsKey(w)) {
                    int value = map.get(w);
                    map.put(w, ++value);
                } else {
                    map.put(w, 0);
                }
            }
            if (map.size() == 1) {
                System.out.println("POSSIBLE");
            } else if (map.size() == 2) {
                boolean res = true;
                for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                    if(entry.getValue() != 4 || entry.getValue() != 8){
                        res = false;
                        break;
                    }
                }
                if(res){
                    System.out.println("POSSIBLE");
                }else{
                    System.out.println("IMPOSSIBLE");
                }
            } else if (map.size() == 3) {
                boolean res = true;
                for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                    System.out.println(entry.getValue());
                    if(entry.getValue() != 4){
                        res = false;
                        break;
                    }
                }
                if(res){
                    System.out.println("POSSIBLE");
                }else{
                    System.out.println("IMPOSSIBLE");
                }
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }

    }
}
