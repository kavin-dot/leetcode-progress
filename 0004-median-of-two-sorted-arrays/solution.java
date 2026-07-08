class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merged=new int[n+m];
        for(int i=0;i<n;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merged[n+i]=nums2[i];
        }
        Arrays.sort(merged);
        int len=merged.length;
        Arrays.sort(merged);
        if(len%2==1){
            return (float) merged[merged.length/2];
        }else{
            return (float) (merged[len/2]+merged[len/2-1])/2.0;
        }
    }
}
