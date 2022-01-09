class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String resString = strs[0];;
        for(int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(resString) != 0) {
                resString = resString.substring(0, resString.length() - 1);
                if (resString.isEmpty()) return "";
            }
        }
        return resString;
    }
}