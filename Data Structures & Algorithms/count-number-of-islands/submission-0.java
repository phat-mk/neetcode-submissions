class Solution {
    public int numIslands(char[][] grid) {
        // for(char[] i : grid) {
        //     for (char j : i) {
        //         System.out.println(j);
        //     }
        // }

        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    DFS(grid, i, j, rows, columns);
                }
            }
        }
        return count;
    }

    public void DFS(char[][] grid, int i, int j, int rows, int columns) {
        if (i < 0 || i >= rows || j < 0 || j >= columns || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        DFS(grid, i - 1, j, rows, columns);
        DFS(grid, i + 1, j, rows, columns);
        DFS(grid, i, j - 1, rows, columns);
        DFS(grid, i, j + 1, rows, columns);
    }
}