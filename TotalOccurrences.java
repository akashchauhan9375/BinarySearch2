/*
 
IN THIS QUESTION WE HAVE TO FIND THE TOTAL NO OF OCCURENCES IN THE GIVEN THE SORTED ARRAY
APPROACH -->

WE WILL FIND THE FIRST OCCURENCE AND LAST OCCURENCE AND WILL COUNT THE NO OF OCCURENCES 
OF THE GIVEN TARGETED ELEMENT

 */



public class TotalOccurrences {
    public static int leftSearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                idx = mid;  // Store the index
                end = mid - 1;  // Search on the left side for the first occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx; // First occurrence index
    }

    public static int rightSearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                idx = mid;  // Store the index
                start = mid + 1;  // Search on the right side for the last occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx; // Last occurrence index
    }

    public static int countOccurrences(int arr[], int target) {
        int left = leftSearch(arr, target);
        int right = rightSearch(arr, target);

        if (left == -1) {
            return 0; // Target not found
        }
        return right - left + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3};
        int target = 2;
        System.out.println("Total occurrences of " + target + ": " + countOccurrences(arr, target));
    }
}
