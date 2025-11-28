package BinarySearch;

import java.util.Arrays;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = new int[100];
         for(int i=0; i<100; i++){
             arr[i] = i*2;
         }
        System.out.println(Arrays.toString(arr));
        int  target = 88;

        System.out.println(ans(arr, target));
    }
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end +1;
            end = end + ( end - start + 1) *2;
            start = newStart;

        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){



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
