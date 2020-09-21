package Interview.Meituan;

import java.util.*;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/2 19:08
 */
public class 不能超过 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            res[i] = temp;
        }
        Arrays.sort(res);

        int ans = 0;
        int l = 0, r = res.length-1;
        while(res[r]-res[l]>x){
            if(res[l+1]-res[l] > res[r]-res[r-1]){
                l++;
            }else{
                r--;
            }
            ans++;
        }

        System.out.println(ans);


    }
}
