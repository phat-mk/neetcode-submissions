class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] == target || matrix[mid][matrix[mid].length-1] == target) {
                return true;
            } else if (matrix[mid][0] < target && target < matrix[mid][matrix[mid].length-1]) {
                int sub_left = 0, sub_right = matrix[mid].length - 1;
                while (sub_left <= sub_right) {
                    int sub_mid = sub_left + (sub_right - sub_left) / 2;
                    if (matrix[mid][sub_mid] == target) {
                        return true;
                    } else if (matrix[mid][sub_mid] < target) {
                        sub_left = sub_mid + 1;
                    } else {
                        sub_right = sub_mid - 1;
                    }
                }
                return false;
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}