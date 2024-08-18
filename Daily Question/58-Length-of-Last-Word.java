/**
Given a string s consisting of words and spaces, return the length of the last word in the string.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) != ' ')
            {
                length++;
            }
            else
            {
                break;
            }
        }
        return length;
    }
}
