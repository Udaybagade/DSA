class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxL=0;
        int ptr=0;
        for(char ch:s.toCharArray()){
            while(set.contains(ch)){
                set.remove(s.charAt(ptr));
                ptr++;
            }
            set.add(ch);
            if(set.size() > maxL)maxL=set.size();
        }
        return maxL;
    }
}