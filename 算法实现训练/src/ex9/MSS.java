package ex9;

public class MSS {

    public static int begin = 0, end = 0;

    public static int MaxSubsequenceSum(int[] a) {
        int maxSum = 0, temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (temp <= 0) {
                temp = a[i];
                begin = i;
            } else {
                temp += a[i];
            }
            if (temp >= maxSum) {
                maxSum = temp;
                end = i;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {-2, 11, -4, 13, -5, -2};
        System.out.println("最大子列和：" + MaxSubsequenceSum(a));
        System.out.print("最大子列：");
        for (int i = begin; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
