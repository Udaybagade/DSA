class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] t=new int[n+1];

        for(int arr[]:trust){

            t[arr[0]]--;
            t[arr[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(t[i]==n-1)return i;
        }
        return -1;

    }
}