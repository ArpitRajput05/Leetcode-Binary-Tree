class Solution {
    public long countCommas(long n) {
        if(n<1000)return 0;
        long ans=0;
        long start=1000;
        while(start<=n){
            ans+=(n-start+1);
            start*=1000;
        }
        return ans;
    }
}