class Solution {
    public int balancedStringSplit(String s) {
        int counter = 0; int balancer =0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'R') {
                balancer++;
            }
           
            if(s.charAt(i) == 'L') {
                balancer--;
            }

            if(balancer == 0) {
                    counter++;
            } 
        }
        return counter;
    }
}