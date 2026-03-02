class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int[] ans=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }else if(nums1[i]>nums2[j]){
                ans[k]=nums2[j];
                k++;
                j++;
            }else{
                ans[k]=nums1[i];
                ans[k+1]=nums2[j];                
                k+=2;
                i++;
                j++;
            }
        }
        while(i<n){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=nums2[j];
            k++;
            j++;
        }
        for(int o:ans){
        System.out.println(o);}
        if((m+n)%2==0){
            return (double)(ans[(m+n)/2]+ans[((m+n)/2)-1])/2;
        }else{
            return ans[(m+n)/2];

        }
    }
}