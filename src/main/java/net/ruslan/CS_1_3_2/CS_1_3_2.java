package net.ruslan.CS_1_3_2;

public class CS_1_3_2 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
