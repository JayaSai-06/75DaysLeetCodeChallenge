class Solution {
    public boolean cs(int[] weights,int days,int m){
        int du=1;
        int cl=0;
        for(int i:weights){
            if(cl+i>m){
                du++;
                cl=i;
            }
            else cl+=i;
        }
        return du<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int i:weights){
            l=Math.max(l,i);
            r+=i;
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(cs(weights,days,mid)) r=mid;
            else l=mid+1;
        }
        return l;
    }
}   