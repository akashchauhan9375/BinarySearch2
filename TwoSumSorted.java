/*
Leetcode -- 167
Array is given and we have to find the two indexes such that they sum up to the given target


 */

 class TwoSumSorted{
    public static int[] target(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int result [] = new int[2];

        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum==target){
                result[0] = start+1;
                result[1] = end+1;
                break; 
            }

            if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        return result;
    }
 }