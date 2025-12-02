package BinarySearch;

public class FindMinRSA {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1,2};
        System.out.println(findMin(arr));
        System.out.println(findMinWithDuplicates(arr));
    }

//    if you return index it will give rotation count
    public static int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
        public static int findMinWithDuplicates(int[] arr){
            int start = 0;
            int end = arr.length-1;

            while(start < end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] > arr[end]) {
                    start = mid + 1;
                } else if(arr[mid] < arr[end]) {
                    end = mid;
                } else{
                    end--;
                }
            }
            return arr[start];
        }
}
