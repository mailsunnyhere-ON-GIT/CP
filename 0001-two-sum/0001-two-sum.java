import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                res[0] = i;
                res[1] = map.get(complement);
                return res; // Return the result immediately when a pair is found
            }

            map.put(nums[i], i);
        }

       return res;
    }
}