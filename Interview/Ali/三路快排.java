package Interview.Ali;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/3 18:58
 */
public class 三路快排 {
    public int[] q3(int[] arr, int start, int end) {
        int []range = new int[2];
        int lt = start;
        int i = start + 1;
        int gt = end + 1;

        while (i < gt) {
            if (arr[i] < arr[lt + 1]) {
                swap(arr, i, lt + 1);
                lt++;
                i++;
            } else if (arr[i] > arr[gt - 1]) {
                swap(arr, i, gt - 1);
                gt--;
            } else {
                i++;
            }
        }
        swap(arr, start, lt);
        range[0] = lt - 1;
        range[1] = gt;
        return range;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
