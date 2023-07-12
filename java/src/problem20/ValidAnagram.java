/**********************************************************************************
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 **********************************************************************************/

package problem20;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
