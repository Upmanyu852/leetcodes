class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        Stack<Integer> stack = new Stack<>();//indices store 
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++)
        {

        while (!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]) {

          int top = stack.pop();
        ans[top]=i-top;//kitne din baad hoga agla greater temp
    }

    stack.push(i);
}

return ans;
        
    }
}