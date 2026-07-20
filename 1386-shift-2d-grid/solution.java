class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;

        int[][] shifted = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int oldIndex = i * cols + j;
                int newIndex = (oldIndex + k) % total;

                int newRow = newIndex / cols;
                int newCol = newIndex % cols;

                shifted[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(shifted[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}
