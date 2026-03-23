class Solution {
    public static boolean yes(int[] a,int mid,int m,int k){
        int cnt=0;
        int b=0;
        for(int i:a){
            if(i<=mid){
                cnt++;
                if(cnt==k){
                    b++;
                    cnt=0;
                }
            }
            else cnt=0;
        }
        return b>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long req=m*k;
        int n=bloomDay.length;
        if(n<req) return -1;
        int mn=Arrays.stream(bloomDay).min().getAsInt();
        int mx=Arrays.stream(bloomDay).max().getAsInt();
        int l=mn;
        int h=mx,res=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(yes(bloomDay,mid,m,k)){
                res=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
}