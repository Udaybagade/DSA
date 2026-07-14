class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=edges.length+1;
        for(int[] edge:edges){
            map.put(edge[0],map.getOrDefault(edge[0],0)+1);
            if(map.get(edge[0])==n-1)return edge[0];

            map.put(edge[1],map.getOrDefault(edge[1],0)+1);
            if(map.get(edge[1])==n-1)return edge[1];
        }
        return -1;
    }
}