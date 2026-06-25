1class Solution {
2    public int fib(int n) {
3        if(n== 0) return 0;
4        if(n== 1) return 1;
5        return fib(n-1) + fib(n-2);
6    }
7}