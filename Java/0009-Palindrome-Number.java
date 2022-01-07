class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0;
        int num = x;
        while(x > 0){
            revNum = revNum * 10 + (x % 10);
            x /= 10;
        }
        return num == revNum;
    }
}