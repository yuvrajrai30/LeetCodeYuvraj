package String;

import java.util.Scanner;

public class atoi {
    class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int i = 0;
        long result = 0; // use long to detect overflow

        // handle sign
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        // parse digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // clamp if overflow
            if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }

        return (int)(sign * result);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Solution solution = new atoi().new Solution();
    System.out.println(solution.myAtoi(input));
}
}