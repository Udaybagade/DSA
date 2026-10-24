class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,n=s.length();
        HashSet<Character> set=new HashSet<>();
        int ptr=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(ptr));
                ptr++;
            }
            set.add(ch);
            if(set.size()>max)max=set.size();
        }
        return max;
    }
}