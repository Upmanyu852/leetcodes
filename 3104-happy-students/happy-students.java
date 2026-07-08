import java.util.*;

class Solution {
    public int countWays(List<Integer> nums) {
        int n = nums.size();
        int count = 0;

        if(n == 0) return 1;

        
        Collections.sort(nums);

        // Choose no student
        if(nums.get(0) > 0)
            count++;

        // Choose some students
        for(int i = 0; i < n - 1; i++){
            if(nums.get(i) < i + 1 && nums.get(i + 1) > i + 1)
                count++;
        }

        // Choose all students
        if(nums.get(n - 1) < n)
            count++;

        return count;
    }
}