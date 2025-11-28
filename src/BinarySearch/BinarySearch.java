package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr = {2, 4, 8, 10 , 12 ,16, 18, 20, 22, 28, 46, 48};
        int target = 30;
        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while( start <= end){
            int mid = start + (end - start)/2;


            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
