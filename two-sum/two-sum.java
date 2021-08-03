class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                map.put(j, nums[j]);
                if (map.get(i) + map.get(j) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}