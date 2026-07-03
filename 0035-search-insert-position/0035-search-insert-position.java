class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] <= target)
            {
                if(nums[i]==target)
                {
                    result=i;
                    break;
                }
            }
            else
            {
                result=i;
                break;
            }
        }
        return result;
    }
}