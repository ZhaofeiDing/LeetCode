package Day20190821;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int avail = 1;
        for(int i = 0;i < digits.length;i++){
            if(digits[digits.length-1-i] + avail < 10){
                res.add(digits[digits.length-1-i]+avail);
                for(int j = i+1;j < digits.length;j++){
                    res.add(digits[digits.length-1-j]);
                }
                avail = 0;
                break;
            }else{
                avail = 1;
                res.add(0);
            }
        }
        if(avail == 1)
            res.add(1);
        int []result = new int[res.size()];
        int j = 0;
        for(int i = res.size()-1;i >= 0;i--){
            result[j++] = res.get(i);
        }
        return result;
    }
}
