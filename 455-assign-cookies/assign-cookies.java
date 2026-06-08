import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childPointer = 0;
        int cookiePointer = 0;
        
        // Loop until you run out of children OR cookies
        while (childPointer < g.length && cookiePointer < s.length) {
            // If the cookie satisfies the child, move to the next child
            if (s[cookiePointer] >= g[childPointer]) {
                childPointer++;
            }
            // Always move to the next cookie
            cookiePointer++;
        }
        
        // The number of content children is represented by the childPointer index
        return childPointer;
    }
}
