class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        stack<int> st;
        st.push(nums[0]);
        vector<int>arr;
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            int temp = st.top();
            if (nums[i] == temp) {
                continue;
            } else {
                st.push(nums[i]);
                count++;
            }
        }
        while(st.size()){
            arr.push_back(st.top());
            st.pop();
        }
        reverse(arr.begin(),arr.end());
        nums.empty();
        nums = arr;
        return count;
    }
};