class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int repeatNumCount = 0;
        int maxRepeatNumCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                repeatNumCount++;
                maxRepeatNumCount = Math.max(maxRepeatNumCount, repeatNumCount);
            } else {
                repeatNumCount = 0;
            }
        }
        return maxRepeatNumCount;
    }
}
