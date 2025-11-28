package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] nums ={5, 7, 7, 7, 8, 9,10};
        int target = 7;
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, false);
        ans[1] = search(nums, target, true);

        System.out.println(Arrays.toString(ans));

    }

    public static int search(int[] nums, int target, boolean searchRight){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;


            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                ans = mid;

                if(searchRight) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return ans;
    }


}
