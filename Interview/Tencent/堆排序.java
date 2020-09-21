package Interview.Tencent;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/23 2:30
 */
public class 堆排序 {

    public static void main(String[] args) {
        int[] R = {3, 2, 99, 1, 65, 54};
        heapSort(R, R.length);
        for (int i : R) {
            System.out.print(i + " ");
        }
    }

    public static void heapSort(int[] array, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
//            System.out.println(i + " " + array[i]);
            adjustHeap(array, i, n - 1);
        }
        for (int j = n - 1; j > 0; j--) {
            int temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            adjustHeap(array, 0, j - 1);
        }

    }

    public static void adjustHeap(int[] array, int i, int high) {
        int father = i, child = father * 2 + 1;
        int temp = array[father];
        while (child <= high) {
            if (child < high && array[child] < array[child + 1]) {
                ++child;
            }
            if (temp < array[child]) {
                array[father] = array[child];
                father = child;
                child = father * 2 + 1;
            } else {
                break;
            }
        }
        array[father] = temp;
    }

}
