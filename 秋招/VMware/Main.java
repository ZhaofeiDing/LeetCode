package 秋招.VMware;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/9/21 20:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int a=0;a<T;a++){
            int n = sc.nextInt();
            int[][] array = new int[2][n];
            for(int c=0;c<2;c++){
                for(int b=0;b<n;b++){
                    array[c][b] = sc.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                if(array[1][i] == array[0][i]){
                    break;
                }else{
                    for(int j=0;j<n;j++){
                        if(array[0][j] == array[1][i]){
                            if(j > i){
                                for(int k=j;k>=i;k--){
                                    array[1][k] = array[0][j];
                                }
                            }else{
                                for(int k=j;k<=i;k++){
                                    array[1][k] = array[0][j];
                                }
                            }
                        }
                    }
                }
            }


        }

    }
}
