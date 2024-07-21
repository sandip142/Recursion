public class Sorted_check {
    public static void main(String[] args) {
        int[] arr ={1,2,9,4,5,6,7,};
       System.out.println( isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr,int index)
    {
        if(index == arr.length-1) return true;

        return arr[index] <= arr[index+1] && isSorted(arr, index+1);
    }
}
