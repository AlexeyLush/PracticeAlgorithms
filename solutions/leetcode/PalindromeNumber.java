package solutions.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int number = x;
        int temp = 0;

        while (number > 0) {
            temp = temp * 10 + number % 10;
            number = number / 10;
        }

        if (temp == x)
            return true;
        return false;
    }
}
