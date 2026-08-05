class Solution {
    public int peakIndexInMountainArray(int[] arr)
    {
        int n=arr.length;
        int start=1;//iska dhyan rkho ye array out of bound condition 
        int end=n-2;//dono end kbhi peak nhi ho skte isliye ye condition lgayi jisse out of bound se abch jauge
        while(start<=end){
        int mid=start+(end-start)/2;//mid element
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            return mid;//if mid element is the peak one
        }
        if(arr[mid]>arr[mid+1])
        {
            end=mid-1;
        }
        else if(arr[mid]<arr[mid+1])
        {
            start=mid+1;
        }
    }
    return -1;
}
}