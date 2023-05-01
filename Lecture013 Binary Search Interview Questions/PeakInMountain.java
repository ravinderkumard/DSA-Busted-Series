class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      // Iterative Solution
        // int left = 0;
        // int right = arr.length-1;
        // while(left<right){
        //     int mid = left+(right-left)/2;
        //     if(arr[mid]<arr[mid+1]){
        //         left = mid+1;
        //     } else {
        //         right = mid;
        //     }
        // }
        // return left;
        
        // Recursive Solution
        int left = 0;
        int right = arr.length-1;
        return peak(arr,left,right);
    }

    public int peak(int[] arr,int left,int right){
        if(left>=right){
            return left;
        }
        int mid = left+(right-left)/2;
        if(arr[mid]<arr[mid+1])
            return peak(arr,mid+1,right);
        else {
            return peak(arr,left,mid);
        }
    }
}
