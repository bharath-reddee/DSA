class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
      if(nums.length<=2){
        return n;
      }  
      int max=0;
      int min=0;
      for(int i=1;i<nums.length;i++){
        max=nums[max]>nums[i]?max:i;
        min=nums[min]<nums[i]?min:i;
      }
      int left=Math.max(max,min)+1;
      int right=n-Math.min(max,min);
      int ltor=Math.min(max,min)+1+n-Math.max(max,min);
    return Math.min(left,Math.min(right,ltor));
     
    }
}