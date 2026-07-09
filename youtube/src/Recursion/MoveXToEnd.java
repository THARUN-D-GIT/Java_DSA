package Recursion;

public class MoveXToEnd {

        static String moveX(String s) {

            // Base case
            if (s.length() == 0) {
                return "";
            }

            char ch = s.charAt(0);

            String smallAns = moveX(s.substring(1));

            if (ch == 'x') {
                return smallAns + ch;
            } else {
                return ch + smallAns;
            }
        }

        public static void main(String[] args) {

            String str = "axbcxxd";

            System.out.println(moveX(str));
        }
    }

