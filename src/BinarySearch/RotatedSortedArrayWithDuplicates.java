package BinarySearch;

public class RotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        int target = 9;
        System.out.println(rotatedSearchWithDuplicates(arr, target));
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target , pivot+1, arr.length -1);

    }


    public static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;



        while(start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if(mid > start && arr[mid] <arr[mid -1]){
                return mid -1;
            }

            if(arr[mid]== arr[start] && arr[mid] == arr[end]){
                if(start < end && arr[start]> arr[start+1]) return start;
                start++;
                if(end > start && arr[end] < arr[end-1]) return end-1;
                end--;
            }

            else if(arr[start] < arr[mid]||(arr[start] == arr[mid] && arr[mid]> arr[end])){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;

    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            if(target< arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }


    public static int rotatedSearchWithDuplicates(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;



        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            else if(arr[start] <= arr[mid] ){
                if(target >= arr[start] && target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }else{
                if(target > arr[mid] && target <= arr[end]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
        }

        return -1;
    }


}
