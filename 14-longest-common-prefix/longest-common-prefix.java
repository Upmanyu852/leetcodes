class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = strs[0].length();
        for(String str : strs) minLen = Math.min(minLen,str.length());
        int i = 0;
        while(i < minLen){
            char ch = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                char temp = strs[j].charAt(i);
                if(ch != temp) return strs[0].substring(0, i);
            }
            i++;
        }
        return strs[0].substring(0, minLen);
    }
}