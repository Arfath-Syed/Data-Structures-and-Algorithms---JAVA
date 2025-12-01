package BinarySearch;

public class SeaarchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry!= -1 ){
            System.out.println(firstTry);
        }else {
            System.out.println(binarySearch(arr, target, peak + 1, arr.length - 1));
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end){



        boolean isASC = arr[start] <= arr[end];

        while( start <= end){
            int mid = start + (end - start)/2;


            if(arr[mid] == target){
                return mid;
            }
            if(isASC){
                if(target > arr[mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }


        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
