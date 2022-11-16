package solutions.leetcode;

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {

        int min = 1;
        int max = n;
        while (min <= max) {

            int cur = min + (max - min) / 2;

            if(guess(cur) == 0) {
                return cur;
            }
            else if(guess(cur) == 1) {
                min = cur + 1;
            }

            else {
                max = cur-1;
            }

        }
        return 0;
    }

}
