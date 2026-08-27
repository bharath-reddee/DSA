class Solution {
    public int compareVersion(String version1, String version2) {
       String arr1[]=version1.split("\\.");
       String arr2[]=version2.split("\\.");
       int n=Math.max(arr1.length,arr2.length);
       for(int i=0;i<n;i++){
        int num1=0;
        int num2=0;
        if(i<arr1.length){
            num1=Integer.parseInt(arr1[i]);
        }
        if(i<arr2.length){
            num2=Integer.parseInt(arr2[i]);
        }
        if(num1<num2){
            return -1;
        }
        if(num1>num2){
            return 1;
        }
       }
       return 0;

    }
}