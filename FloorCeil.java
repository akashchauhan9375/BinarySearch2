
/*
 
IN THIS QUESTION WE HAVE TO FIDN THE FLOOR AND CEIL VALUE OF THE GIVEN NUMBER

SOLUTION -->
APPLY BINARY SEARCH AND IF START CHANGES THEN UPDATE THE FLOOR TO MID AND IF END CHANGES THEN 
UPDATE THE CEIL TO MID 


 */


class FloorCeil{
    public static int [] getFloorCeil(int arr[],int x){
        int floor = getFloor(arr,x);
        int ceil =  getCeil(arr,x);

        return new int[]{floor,ceil};
    }

    public static int getFloor(int arr[],int x){
        int f = -1;
        int n = arr.length-1;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]<x){
                start = mid+1;
                f = arr[mid];
            }
            else{
                end = mid-1;
            }
        }
        return f;
    }

    public static int getCeil(int arr[],int x){
        int c = -1;
        int n = arr.length-1;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>x){
                end = mid-1;
                c = arr[mid];
            }
            else{
                start = mid+1;
            }
        }
        return c;
    }

}