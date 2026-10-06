class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0],s2=strs[strs.length-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s2.charAt(i)){
                ans.append(s.charAt(i));

            }else break;
        }
        return ans.toString();
    }
}