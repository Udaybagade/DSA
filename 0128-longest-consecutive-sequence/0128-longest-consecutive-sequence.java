class Solution{
    public int longestConsecutive(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);

        int ans=0;
        for(int i:set){
            if(! set.contains(i-1)){
                int curN=i;
                int len=1;
                while(set.contains(curN+1)){
                    curN++;
                    len++;
                }
                if(len>ans)ans=len;
            }
        }
        return ans;
    }
}

/*
import java.util.*;
class Solution{
    public int longestConsecutive(int[] nums){
        int n=nums.length;
        if(n==0)
            return 0;

        Arrays.sort(nums);
        int maxCount=0;
        int count=0;
        int ls=Integer.MIN_VALUE;//lastsmallest
        for(int i=0;i<n;i++){
            if(nums[i]-1==ls){
                count++;
                ls=nums[i];
            }else if(nums[i]!=ls){
                count=1;
                ls=nums[i];
            }
            if(count>maxCount){
                maxCount=count;
            }
        }
    return maxCount;
    }
}*/


/*
import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums);

        int maxc = 1;       // at least one number exists
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                // skip duplicates
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                // consecutive number
                count++;
            } else {
                // reset count if not consecutive
                maxc = Math.max(maxc, count);
                count = 1;
            }
        }

        // Final check after loop
        maxc = Math.max(maxc, count);

        return maxc;
    }
   
}
*/



/*      Wrong ans
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        Arrays.sort(nums);
        int maxc=0;
        int candidate=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            
            else if(count==0){
                candidate=nums[i];
                count++;
            }
            else{
                if(nums[i]== ( nums[i-1]+1) ){
                    count++;
                    maxc= count>maxc ?count :maxc;
                }else{
                    count=0;
                }
            }
        }
        return maxc;
    }
}*/