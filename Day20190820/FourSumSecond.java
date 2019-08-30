package Day20190820;

import java.util.HashMap;
import java.util.Map;

public class FourSumSecond {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> m = new HashMap();
        for(int i = 0;i < A.length; i++){
            for(int j = 0;j < B.length; j++){
                int sum = A[i] + B[j];
                m.put(sum, m.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for(int i = 0;i < C.length; i++){
            for(int j = 0;j < D.length;j++){
                int sum = -(C[i] + D[j]);
                if(m.get(sum) != null){
                    res += m.get(sum);
                }
            }
        }
        return res;
    }
}
