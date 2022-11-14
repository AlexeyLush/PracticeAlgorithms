package solutions.leetcode;

import java.util.HashMap;

public class TwoSum {
    public int[] solve(int[] nums, int target) {

        HashMap<Integer, Integer> positions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (positions.containsKey(diff)) {
                return new int[] {i, positions.get(diff)};
            }

            positions.put(nums[i], i);

        }
        return null;

    }
}
