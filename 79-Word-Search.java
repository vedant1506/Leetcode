class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Scan the grid for the first letter of the word
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == word.charAt(0)) {
                    if (dfs(board, word, r, c, 0)) {
                        return true; // Word found!
                    }
                }
            }
        }

        return false; // Word does not exist in the board
    }

    private boolean dfs(char[][] board, String word, int r, int c, int index) {
        // Base Case 1: All characters in the word matched successfully!
        if (index == word.length()) {
            return true;
        }

        // Base Case 2: Boundary check or character mismatch
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index)) {
            return false;
        }

        // --- Backtracking Step ---
        // 1. Mark current cell as visited
        char temp = board[r][c];
        board[r][c] = '#';

        // 2. Explore all 4 neighbors: Down, Up, Right, Left
        boolean found = dfs(board, word, r + 1, c, index + 1) ||
                        dfs(board, word, r - 1, c, index + 1) ||
                        dfs(board, word, r, c + 1, index + 1) ||
                        dfs(board, word, r, c - 1, index + 1);

        // 3. Unmark / Restore the cell for subsequent searches
        board[r][c] = temp;

        return found;
    }
}