package _8_19_24;

class Solution {
    public int minSteps(int n) {
        int c = 0;
        int div = 2;

        while (n > 1) {
            while (n % div == 0) {
                c += div;
                n /= div;
            }
            div++;
        }
        return c;
    }
}