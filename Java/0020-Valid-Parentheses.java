/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Input: s = "()[]{}"
Output: true
 */
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
    
        for(int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            if(current == '(' || current == '{' || current == '[' )
                stack.push(current);
            else
            {
                if(stack.empty())
                    return false;
                else
                {
                    char peek = stack.peek();
                    if((current == ')' && peek == '(') || (current == '}' && peek == '{') || (current == ']' && peek == '['))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.empty();
    }
}
