class Solution {
    public int removeElement(int[] nums, int val) {
        int numCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[numCount] = nums[i];
                numCount ++;
            }
        }
        return numCount;
    }
}
