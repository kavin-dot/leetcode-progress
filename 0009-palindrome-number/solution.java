class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original=x;
        int y=x;
        int reverse=0;
        while(y!=0){
            int digit=y%10;
            reverse=reverse*10+digit;
            y=y/10;
        }
        return original==reverse;
    }
}


