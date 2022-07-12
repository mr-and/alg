/**********************************************************************************
 *
 *
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
 * For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
 *
 *
 **********************************************************************************/

package minNumberOfDeciBinaryNumbers;

public class MinNumDeciBinaryNum {

    public int minPartitions(String n) {
        return n.chars().max().getAsInt() - '0';
    }

}
