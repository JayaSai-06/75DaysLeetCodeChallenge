class Solution {
    public int sumd(int[] nums,int mid){
        int s=0;
        for(int n:nums){
            s+=Math.ceil((double)n/mid);
        }
        return s;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,h=Arrays.stream(nums).max().getAsInt();
        while(l<=h){
            int mid=(l+h)/2;
            if(sumd(nums,mid)<=threshold){
                h=mid-1;
            }
            else l=mid+1;
        }
        return l;
    }
}