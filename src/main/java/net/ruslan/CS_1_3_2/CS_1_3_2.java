package net.ruslan.CS_1_3_2;

public class CS_1_3_2 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

}
