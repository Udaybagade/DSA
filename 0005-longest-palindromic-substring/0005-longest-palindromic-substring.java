class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length() <0)return "";

        String ans="";
        int n=s.length(),maxL=0;
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>=0&&r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 >maxL){
                    maxL=r-l+1;
                    ans=s.substring(l,r+1);
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0&&r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 >maxL){
                    maxL=r-l+1;
                    ans=s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return ans;
    }
}