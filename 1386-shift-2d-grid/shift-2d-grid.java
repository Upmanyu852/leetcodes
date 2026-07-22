class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int size = m*n;
        k %= size;
        
        int temp[] = new int[size];
        int ind = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                temp[ind++] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ind = 0;
        for(int i=0; i<m; i++){
            List<Integer> list = new ArrayList<>();

            for(int j=0; j<n; j++){
              int oldIndex = (ind - k + size) % size;
              list.add(temp[oldIndex]);
              ind++;  
            }
            
            ans.add(list);
        }

        return ans;
    }
}