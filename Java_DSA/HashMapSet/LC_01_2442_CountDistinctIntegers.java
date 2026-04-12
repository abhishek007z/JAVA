import java.util.HashSet;

public class LC_01_2442_CountDistinctIntegers {

    public static void main(String[] args) {
        int[] nums = {1, 13, 10};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

            int rev = reverse(nums[i]);
            set.add(rev);
        }

        System.out.println("Distinct count: " + set.size());
    }

 
    public static int reverse(int n) {
        int r = 0;

        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }

        return r;
    }
}