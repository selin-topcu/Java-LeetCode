class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        // first solution O(n2)
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }    
            }
        }
        throw new IllegalStateException("not found");
        */
        //second solution
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer remainder = target - nums[i];
            if(indexMap.containsKey(remainder)){
                return new int [] {indexMap.get(remainder), i};
            }
            indexMap.put(nums[i], i);
        }

        throw new IllegalStateException("no pair");
    }
}