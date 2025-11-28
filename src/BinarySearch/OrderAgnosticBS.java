package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[]  arr = {2, 4, 8, 10 , 12 ,16, 18, 20, 22, 28, 46, 48};
        int[] arr = {90, 88, 86, 82, 67, 65, 63, 62 , 48, 43, 32, 30, 22};
        int target = 30;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

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
}
