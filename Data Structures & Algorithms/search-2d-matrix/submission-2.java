class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix[0].length;
        int column = matrix.length;
        int left = 0, right = column - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] == target || matrix[mid][row - 1] == target) return true;

            if(matrix[mid][0] < target && matrix[mid][row-1] > target) {
                int subLeft = 1, subRight = row - 2;
                while(subLeft <= subRight) {
                    int subMid = subLeft + (subRight - subLeft) / 2;
                    System.out.println("subMid"+subMid);
                    if(matrix[mid][subMid] < target) {
                        subLeft = subMid + 1;
                    } else if (matrix[mid][subMid] > target) {
                        subRight = subMid - 1;
                    } else {
                        return true;
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