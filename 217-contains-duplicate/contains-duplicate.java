class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums) //
        {
            if(set.contains(num))//for duplicacy return either true or false
            {
                return true;//duplicate found
            }
            set.add(num);//add the value to array but donot add duplicate numbers
        }
        return false;   //all elements are unique
    }
}