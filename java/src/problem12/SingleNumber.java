/**********************************************************************************
 *
 *  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 *  You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 *
 **********************************************************************************/


package problem12;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
