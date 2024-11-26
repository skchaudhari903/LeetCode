/**
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

 */
class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(mid == x/mid)
            {
                return mid;
            }
            else if(mid < x/mid)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return right;
    }
}
