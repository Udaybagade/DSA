class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(ans,temp,candidates,target,0,0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> temp,int[] nums,int tar,int sum ,int start){
        if(sum==tar){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<nums.length;i++){
            if(sum+nums[i] <=tar){
                
                sum+=nums[i];
                temp.add(nums[i]);
                backtrack(ans,temp,nums,tar,sum,i);
                
                sum-=nums[i];
                temp.remove(temp.size()-1);
            }
        }
    }
}
/*
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backT(ans,temp,0,target,candidates,0);
        return ans;
    }
    public void backT(List<List<Integer>> ans,List<Integer> temp,int sum,int tar ,int[] can,int start){
        
        if(sum==tar){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=start;i<can.length;i++){
            if(sum+can[i] <=tar){
                temp.add(can[i]);
                sum+=can[i];
                backT(ans,temp,sum,tar,can,i);
                sum-=can[i];
                temp.remove(temp.size()-1);
            }
        }
    }
}*/