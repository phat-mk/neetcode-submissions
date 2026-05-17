class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;

        if (n <= 1) return;

        for (int[] row : matrix) {
            if (row.length != n) {
                System.out.println("Not correct format");
                return;
            }
        }

        for (int i = 0; i < n; i ++) {
            if (matrix[i].length != n) {
                System.out.println("Not correct format");
                return;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 1 3
        // 2 4

        // 1 <=> 3
        // 2 <=> 4

        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         System.out.println(matrix[i][j]);
        //     }
        // }
    }
}