1class Solution {
2
3    public boolean isSafe(char [][] board , int row , int col , int number) {
4        for(int i = 0; i<board.length ; i++) {
5            if(board[i][col]==(char)(number + '0')) {
6                return false;
7            }
8            if(board[row][i] == (char)(number + '0')) {
9                return false;
10            }
11        }
12
13        //grid
14        int sr = (row/3) * 3;
15        int sc = (col/3) * 3;
16
17        for(int i=sr; i<sr+3;i++) {
18            for(int j=sc ; j<sc+3; j++) {
19                if(board[i][j] == (char)(number + '0')) {
20                    return false;
21                }
22            }
23        }
24        return true;
25    }
26
27
28    public boolean helper(char[][] board , int row , int col) {
29        if(row == board.length) {
30            return true;
31        }
32
33        int nrow = 0;
34        int ncol = 0;
35
36        if(col != board.length-1) {
37            nrow = row;
38            ncol = col + 1;
39        } else {
40            nrow = row + 1;
41            ncol = 0;
42        }
43
44        if(board[row][col] != '.') {
45            if(helper(board, nrow, ncol)) {
46                return true;
47            }
48        } else {
49            for(int i = 1; i<= 9; i++) {
50                if(isSafe(board, row, col ,i)) {
51                    board[row][col] = (char)(i+'0');
52                    if (helper(board,nrow,ncol)) {
53                        return true;
54                    } else {
55                        board[row][col]='.';
56                    }
57                }
58            }
59        }
60        return false;
61    }
62    public void solveSudoku(char[][] board) {
63        helper(board, 0, 0);
64    }
65}