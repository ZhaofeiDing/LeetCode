package 每日一题.Year2020March;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/11 22:49
 */
public class 第11天将数组分成和相等的三个部分 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if(sum % 3 != 0)
            return false;
        int flag = 0, temp = 0;
        for (int j : A) {
            temp += j;
            if (temp == sum / 3) {
                flag++;
                temp = 0;
            }
        }
        return flag >= 3;
    }

}
