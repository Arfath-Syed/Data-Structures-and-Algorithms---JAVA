package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14};
        int target = 8;
        System.out.println(floor(arr, target));

    }

    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[0]){
                return -1;
            }
            if(target == arr[mid]){
                return mid;
            }

            if(target > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return end;
    }
}
