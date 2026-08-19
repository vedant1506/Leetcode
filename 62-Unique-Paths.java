class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return countPaths(0, 0, m, n, memo);
    }

    private int countPaths(int r, int c, int m, int n, int[][] memo) {
        // Base Case 1: Reached destination
        if (r == m - 1 && c == n - 1) {
            return 1;
        }

        // Base Case 2: Out of grid bounds
        if (r >= m || c >= n) {
            return 0;
        }

        // Check if already calculated
        if (memo[r][c] != 0) {
            return memo[r][c];
        }

        // Recursive Calls: Down + Right
        int down = countPaths(r + 1, c, m, n, memo);
        int right = countPaths(r, c + 1, m, n, memo);

        // Store result in memo table and return
        return memo[r][c] = down + right;
    }
}