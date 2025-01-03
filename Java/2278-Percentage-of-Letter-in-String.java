/**
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.
Input: s = "foobar", letter = "o"
Output: 33
 */
class Solution {
    public int percentageLetter(String s, char letter) {
        
        double count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == letter)
                count++;
        }
        double result = (count/s.length())*100;
        return (int) result;
    }
}
