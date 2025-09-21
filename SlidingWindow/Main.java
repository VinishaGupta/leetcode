package leetcode.SlidingWindow;

//Maximum Sum Subarray of Size K
//
//Given an array of integers and a number k, find the maximum sum of
//any contiguous subarray of size k.

public class Main {
    public static void main(String[] args) {
        int[] arr={4,5,1,8,3,2,7,6};
        int k=3;

        System.out.println(findMaxSubArray(arr,k));
    }

    public static int findMaxSubArray(int[] arr,int k){
        int max=Integer.MIN_VALUE;
        int windowSum=0;

        for (int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }

        max=windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum=windowSum+arr[i]-arr[i-k];
            if(windowSum>max){
                max=windowSum;
            }
        }

        return max;


    }
}
