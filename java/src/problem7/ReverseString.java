/**********************************************************************************
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 **********************************************************************************/

package problem7;

public class ReverseString {

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char tmp;
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
