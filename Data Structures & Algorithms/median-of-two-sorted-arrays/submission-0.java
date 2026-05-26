class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] list = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0,
                        list, 0,
                        nums1.length);

        System.arraycopy(nums2, 0,
                        list, nums1.length,
                        nums2.length);
        
        Arrays.sort(list);
        int n = list.length;
        if(n % 2 == 0){
            int mid = (n - 1) / 2;
            return (double) (list[mid] + list[mid + 1]) / 2;
        } else {
            int mid = n / 2;
            return list[mid];
        }
    }
}