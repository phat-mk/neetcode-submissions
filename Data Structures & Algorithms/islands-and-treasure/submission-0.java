class Solution {
    private static final int INF = 2147483647;
    public void islandsAndTreasure(int[][] grid) {
        if (grid == null) return;

        Queue<int[]> queue = new LinkedList<>();

        int rows = grid.length;
        int columns = grid[0].length;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0 ; j < columns; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        BFS(grid, queue);
    }

    private void BFS(int[][] grid, Queue<int[]> queue) {
        int[][] steps = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int rows = grid.length;
        int columns = grid[0].length;

        while(!queue.isEmpty()) {
            int[] cell = queue.poll();

            int r = cell[0], c = cell[1];

            for (int[] step : steps) {
                int newRow = r + step[0];
                int newColumn = c + step[1];

                if (newRow < 0 || newRow >= rows || newColumn < 0 || newColumn >= columns) continue;

                if (grid[newRow][newColumn] == INF) {
                    grid[newRow][newColumn] = grid[r][c] + 1;
                    queue.add(new int[]{newRow, newColumn});
                }
            }
        }
    }
}