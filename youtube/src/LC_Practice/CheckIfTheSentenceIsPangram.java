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
        /*
        LC-1832
        A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
         */

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