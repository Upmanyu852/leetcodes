class Solution {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {

        int rows = grid.length;
        int cols = grid[0].length;

        // boundary + water check
        if(i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        // mark visited
        grid[i][j] = '0';

        // explore 4 directions
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }
}