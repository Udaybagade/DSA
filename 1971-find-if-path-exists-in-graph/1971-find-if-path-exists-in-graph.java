class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        if(n==1)return true;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int u=edge[0],v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        return checkDfs(graph,visited,source,destination);
    }
    public boolean checkDfs(List<List<Integer>> graph,boolean[] visited,int src,int dest){
        if(src==dest)return true;
        visited[src]=true;
        for(int w:graph.get(src)){
            if(!visited[w]){
                if(checkDfs(graph,visited,w,dest)){
                    return true;
                }
            }
        }
        return false;
    }
}


/*
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        if(n==1)return true;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0],v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        return checkDfs(graph,source,destination,visited);
    }
    public boolean checkDfs(List<List<Integer>> graph,int src,int dest,boolean[] visited){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int w:graph.get(src)){
            if(!visited[w]){
                if(checkDfs(graph,w,dest,visited))
                {return true;}
            
            }
        }
        return false;
    }
}
*/
/*
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph=new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int v1=edge[0];
            int v2=edge[1];
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        boolean[] visited=new boolean[n];
        return isPath(graph,source,destination,visited);
    }

    public boolean isPath(List<Integer>[] graph,int src,int des,boolean[] visited  ){
        if(src==des)return true;

        visited[src]=true;
        for(int nbr:graph[src]){
            if(visited[nbr]==false){
                if(isPath(graph,nbr,des,visited)) return true;
            }
        }
        return false;
    }
}*/