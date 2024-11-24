/**
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
Input: nums = [1,3,5,6], target = 5
Output: 2
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        /**
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] >= target)
                    return i;
            }
            return nums.length;
         */
         // O(log n) complexity
         int start = 0;
         int mid = -1;
         int end = nums.length-1;

         while(start <= end)
         {
            mid = start + (end - start) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }
         }
        return start;
    }
}
