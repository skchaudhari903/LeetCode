/**
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Input: nums = [3,2,3]
Output: 3
 */
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int majorityElement = 0;
        int maxCount = 0;
        for(int n : nums)
        {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
            if(frequencyMap.get(n) > maxCount)
            {
                majorityElement = n;
                maxCount = frequencyMap.get(n);
            }
        }
        return majorityElement;
    }
}
