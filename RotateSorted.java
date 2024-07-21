public class RotateSorted {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(rotatesort(arr, 3, 0, arr.length-1));
    }

    public static int  rotatesort(int[] arr,int target,int s ,int e){
        //base or termination condition
        if(e<s){
          return -1;
        }
// finding middke elememns
        int mid = (e+s)/2;

        if(arr[mid]==target){
            return mid;
        }


        // check right half is sortec by desending order
        // and checking inthat section 
        if(arr[s]<arr[mid]){
            if(arr[s]< target && arr[mid]>target){
                return rotatesort(arr, target, s, mid-1);
            }else{
                return rotatesort(arr, target,mid+1, e);
            }
        }


        //if left half is sorted by ASCENDING
        if(arr[mid]< target && arr[e]>target){
            return rotatesort(arr, target,mid+1, e);
        }
        return rotatesort(arr, target, s, mid-1);
    }
}
