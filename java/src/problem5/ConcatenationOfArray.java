/**********************************************************************************
 *
 * Given an integer array nums of length n, you want to create
 * an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * Specifically, ans is the concatenation of two nums arrays.
 *
 **********************************************************************************/

package problem5;


public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] conArray = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++) {
            conArray[i] = nums[i];
            conArray[nums.length + i] = nums[i];
        }
        return conArray;
    }
}
