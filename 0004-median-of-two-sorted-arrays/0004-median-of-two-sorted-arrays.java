class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] a=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                a[k]=nums1[i];
                i++;
            }
            else{
                a[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k++]=nums1[i++];
        }
        while(j<n2){
            a[k++]=nums2[j++];
        }
        int z=a.length;
        if(z%2!=0) return a[z/2];
        return (a[(z-1)/2]+a[z/2])/2.0;
    }
}