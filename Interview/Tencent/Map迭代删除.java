package Interview.Tencent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/9 19:23
 */
public class Map迭代删除 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        int[] array = new int[5];

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        Map.Entry<String, Integer> entry;
        int i = 0;
        while(it.hasNext()){
            entry = it.next();
            if(entry.getValue().equals(array[i])){
                it.remove();
                i++;
            }
        }

    }
}
