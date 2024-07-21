public class max {
    public static void main(String[] args) {
        int[] arr  ={2,1,5,7,8,9,3,18};
        System.out.println(MaxInArray(arr, 0, 0));
    }

    public static int MaxInArray(int arr[],int index,int max){
        if(index==arr.length){
            return max;
        }

        if(arr[index]>max){
            return MaxInArray(arr, index+1,arr[index]);
        }else{
            return MaxInArray(arr, index+1, max);
        }
    }
}
