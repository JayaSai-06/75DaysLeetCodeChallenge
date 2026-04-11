class Solution {
    public int solve(int m,int[] a){
        int s=0;
        int np=1;
        for(int i:a){
            if(s+i<=m){
                s+=i;
            }
            else{
                np++;
                s=i;
            }
        }
        return np;
    }
    public int splitArray(int[] nums, int k) {
        int l=Arrays.stream(nums).max().getAsInt();
        int h=Arrays.stream(nums).sum();
        while(l<=h){
            int mid=(l+h)/2;
            int p=solve(mid,nums);
            if(p>k) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
}