class Solution {
    private long calth(int[] piles,int m){
        long th=0;
        for(int b:piles){
            th+=(long)Math.ceil((double)(b)/m);
        }
        return th;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int mx=Arrays.stream(piles).max().getAsInt();
        int l=1;
        int hi=mx;
        int res=mx;
        while(l<=hi){
            int mid=(l+hi)/2;
            long th=calth(piles,mid);
            if(th<=h){
                res=mid;
                hi=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
}