public class binary {
    public static void main(String[] args) {
        int arr[] ={1,3,4,6,8,9,10,17};
       int c= BinarySearch(arr, 4, 0, arr.length-1);
       System.out.println(c);
    }

    public static int BinarySearch(int[] arr,int target,int s,int e){
        if(s>e){
           return -1;         
        }

        int mid =(s+e)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
           return BinarySearch(arr, target, s, mid-1);
        }else{
           return BinarySearch(arr, target, mid+1, e);
        }

        
    }
}
