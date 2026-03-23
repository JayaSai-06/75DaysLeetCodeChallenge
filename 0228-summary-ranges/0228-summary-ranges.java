class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start=nums[i];
            while(i+1<n && nums[i+1]-nums[i]==1){
                i++;
            }
            int end=nums[i];
            if(start==end) li.add(String.valueOf(start));
            else li.add(start+"->"+end);
        }
        return li;
    }
}