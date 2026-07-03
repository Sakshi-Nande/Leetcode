class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int [] arr=new int[nums.length];

        for(int i=0;i<=nums.length-1;i++)
        {
            int count=0;
            int current=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i && nums[j] < nums[i])
                {
                    count++;
                }
            }
            arr[i]=count;
        }


    return arr;
        
    }
}