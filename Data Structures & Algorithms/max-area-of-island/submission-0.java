class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int columns = grid[0].length;
        int maxArea = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    int tempMaxArea = DFS(grid, i, j, rows, columns);
                    maxArea = Math.max(maxArea, tempMaxArea);
                }
            }
        }

        return maxArea;
    }

    
    public int DFS(int[][] grid, int i, int j, int rows, int columns) {
        if (i < 0 || i >= rows || j < 0 || j >= columns || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + DFS(grid, i-1, j, rows, columns) +
            DFS(grid, i+1, j, rows, columns) +
            DFS(grid, i, j-1, rows, columns) +
            DFS(grid, i, j+1, rows, columns);
    }
}