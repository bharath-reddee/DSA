class Solution {
    int sum=0;
    public void helper(int nums[],int index,int currentxor){
        if(index==nums.length){
            sum+=currentxor;
            return;
        }
        helper(nums,index+1,currentxor^nums[index]);
        helper(nums,index+1,currentxor);
    }
    public int subsetXORSum(int[] nums) {
        helper(nums,0,0);
        return sum;
    }
}