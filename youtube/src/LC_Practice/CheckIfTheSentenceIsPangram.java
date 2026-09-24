package LC_Practice;

public class CheckIfTheSentenceIsPangram {

    // LeetCode 1832
    public boolean checkIfPangram(String sentence) {
        boolean[] ans = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            ans[ch - 'a'] = true;
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == false) {
                return false;
            }
        }

        return true;
    }

    // Main function
    public static void main(String[] args) {

        CheckIfTheSentenceIsPangram obj =
                new CheckIfTheSentenceIsPangram();

        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";

        System.out.println("Input: " + sentence1);
        System.out.println("Output: " + obj.checkIfPangram(sentence1));

        System.out.println();

        System.out.println("Input: " + sentence2);
        System.out.println("Output: " + obj.checkIfPangram(sentence2));
    }
}