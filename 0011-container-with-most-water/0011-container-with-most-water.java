
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length -1;

        int maxA=0;
        while(l<r){
            int a=Math.min(height[l] ,height[r] )*(r-l);
            maxA=Math.max(maxA,a);
            if(height[l] <height[r]) l++;
            else r--;
        }
        return maxA;
    }
}

/*
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length -1;
        int maxArea=0;
        while(l<r){
            int area=Math.min(height[l],height[r]) * (r-l);
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r])l++;
            else r--;
        }
        return maxArea;
    }
}*/

/*
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxArea=0;
        while(l<r){
            int area=Math.min(height[l],height[r]) * (r-l);
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r])l++;
            else r--;
        }
        return maxArea;
    }
}*/