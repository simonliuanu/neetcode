// Solution 1
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == pre) {
                return true;
            }
            pre = nums[i];
        }
        return false;
    }
}

// Solution 2
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}
