package Strings;

public class StringToInt {
    static void main(String[] args) {
        /*

         */
        String s=" -1233";
        System.out.println(myAtoi(s));
    }
    public static  int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check if string contains only spaces
        if (i == n) return 0;

        // Handle sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        long num = 0;

        // Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Handle overflow
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }
}
