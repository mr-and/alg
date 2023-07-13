package problem21;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int total = (n * (n-1 )) / 2;

        for (int num : nums) {
            total -= num;
        }

        return total;
    }
}
