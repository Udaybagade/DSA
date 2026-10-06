class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            int findN=target-nums[i];
            if(map.containsKey(findN)){
                ans[0]=map.get(findN);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}