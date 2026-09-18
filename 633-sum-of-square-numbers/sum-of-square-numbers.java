class Solution {
    public boolean judgeSquareSum(int c) {
     for(int a=0;(long)a*a<=c;a++){
        int remaining=c-a*a;
        int low=0;
        int high=(int)Math.sqrt(remaining);
        while(low<=high){
            int mid=low+(high-low)/2;
            long square=(long)mid*mid;
            if(square==remaining){
                return true;
            }
           else if(square<remaining){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       
     }
      return false;
    }
}