class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c=nums1.length+nums2.length;
        
        int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        for(int i=nums1.length,j=0;i<nums1.length+nums2.length;i++,j++){
            a[i]=nums2[j];
            
        }
        for(int nums:a){
            System.out.println(nums);
        }
        Arrays.sort(a);
        if((nums1.length+nums2.length)%2==1){
            int i= c/2;
            System.out.print(c);
            return a[i];
        }
        double j= (a[c/2]+a[(c/2)-1])/2.0;
        return j;
    }
}