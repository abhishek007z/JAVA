package Queues;

import java.util.ArrayList;
import java.util.List;

public class firstNegative {
    public static List<Integer> firstNegInt(int[] arr, int k) {
        int fstNegIdx = 0;
        List<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i = k - 1; i < n; i++) {
            while (fstNegIdx < i && (fstNegIdx <= i - k || arr[fstNegIdx] >= 0)) {
                fstNegIdx++;
            }
            if (fstNegIdx < n && arr[fstNegIdx] < 0) {
                res.add(arr[fstNegIdx]);
            } else {
                res.add(0);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> res = firstNegInt(arr, k);
        System.out.println(res);
    }
}
