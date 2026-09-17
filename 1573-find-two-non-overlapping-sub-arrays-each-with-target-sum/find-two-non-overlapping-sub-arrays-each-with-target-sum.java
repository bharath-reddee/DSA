class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int[] prev=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            prev[i]=Integer.MAX_VALUE;
        }

        while(right<arr.length){
            sum=sum+arr[right];

            while(sum>target&&left<=right){
                sum=sum-arr[left];
                left++;
            }

            if(right>0){
                prev[right]=prev[right-1];
            }

            if(sum==target){
                int length=right-left+1;

                if(left>0&&prev[left-1]!=Integer.MAX_VALUE){
                    ans=Math.min(ans,length+prev[left-1]);
                }

                min=Math.min(min,length);
                prev[right]=min;
            }

            right++;
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}