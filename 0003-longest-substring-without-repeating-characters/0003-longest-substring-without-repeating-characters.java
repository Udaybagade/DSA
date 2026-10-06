class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL=0;
        HashSet<Character> set=new HashSet<>();
        int ptr=0;
        for(char ch:s.toCharArray()){
            
           while(set.contains(ch)){
                set.remove(s.charAt(ptr));

                ptr++;
           }
           set.add(ch);
           if(set.size()>maxL)maxL=set.size();
        }
        return maxL;
    }
}