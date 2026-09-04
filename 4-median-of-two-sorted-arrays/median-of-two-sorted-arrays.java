class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] temp=new int[m+n];
        int k=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]) {
                    temp[k]=nums1[i];
                    k++;
                    i++;
            }
            else{
                temp[k]=nums2[j];
                k++;
                j++;

            }
}
while(i<m)
temp[k++]=nums1[i++];
while(j<n)
temp[k++]=nums2[j++];
        double median=0;
        int len=m+n;
        if(len%2==1)
        median=temp[len/2];
        else
         median= (temp[len / 2 - 1] + temp[len / 2]) / 2.0;
        return median;
    }
}