/**********************************************************************************
 *
 * Write a function that takes the binary representation of an unsigned integer
 * and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 **********************************************************************************/

package problem17;

public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) counter++;
            n >>= 1;
        }
        return counter;
    }
}
