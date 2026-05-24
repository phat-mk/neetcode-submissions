class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        if (target == nums[left]) return left;
        if (target == nums[right]) return right;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            
            if(nums[mid] > nums[right]) {
                if (target < nums[mid] && target < nums[right]) {
                    left = mid + 1;
                } else if (target < nums[mid] && target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            // 5 1 2 3 4
            // 1
            } else if (nums[mid] < nums[left]) {
                if (target > nums[mid] && target < nums[right]) {
                    left = mid + 1;
                } else if (target > nums[mid] && target > nums[right]) {
                    right = mid - 1;
                } else {
                    right = mid - 1;
                }
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}