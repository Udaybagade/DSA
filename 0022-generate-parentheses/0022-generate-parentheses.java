class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        genPara(ans,"",0,0,n);
        return ans;
    }
    public void genPara(List<String> ans,String cur,int open,int close,int n){
        if(cur.length()==2*n){
            ans.add(cur);
            return;
        }
        if(open<n){
            genPara(ans,cur+"(",open+1,close,n);
        }
        if(close<open){
            genPara(ans,cur+")",open,close+1,n);
        }
    }

}


/*
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        genPara(ans,"",0,0,n);
        return ans;
    }
    public void genPara(List<String> ans,String str,int open,int close,int n){
        if(str.length()==n*2){
            ans.add(str);
            return;
        }
        if(open<n){
            genPara(ans,str+"(",open+1,close,n);
        }
        if(close<open){
            genPara(ans,str+")",open,close+1,n);
        }
    }
}*/


/*
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        genPara(result,"",0,0,n);
        return result;
    }
    public void genPara(List<String> ans,String s,int open,int close,int n){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(open < n){
            genPara(ans,s+"(",open+1,close,n);
        }
        if(close<open){
            genPara(ans,s+")",open,close+1,n);
        }
    }
}*/