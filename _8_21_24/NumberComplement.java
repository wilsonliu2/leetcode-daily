package _8_21_24;

class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();

        String numStr = Integer.toBinaryString(num);
        char[] charArr = numStr.toCharArray();

        for (char c : charArr) {
            if (c == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        int com = Integer.parseInt(sb.toString(), 2);
        return com;
    }
}