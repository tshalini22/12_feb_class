class calculator{
    private int ans;
    public int add(int a){
        ans+=a;
        return ans;
    }
    public int sub(int b){
        ans-=b;
        return ans;
    }
    public int mul(int c,int d){
        ans = c*d;
        return ans;
    }
}