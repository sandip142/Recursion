import java.util.*;

public class Linear_search {
    public static void main(String[] args) {
        int arr[] ={2,3,5,1,3,4,3,9};
        System.out.println(search(arr, 1, 0));
        System.out.println(linearSearch(arr, 1, 0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(FindAll(arr, 3, 0, list));
        System.out.println(list);
    }


    public static boolean search(int arr[],int target,int index){
        if(arr.length==index) return false;

        return (arr[index]==target || search(arr, target, index+1));
    }
    public static int linearSearch(int[] arr, int target,int index) {
        if(arr.length-1==index){
            return -1;
        }
        
        if(arr[index]==target){
            return index;
        }else{
            return linearSearch(arr, target, index+1);
        }
    }

    public static ArrayList<Integer> FindAll(int[] arr, int target,int index,ArrayList<Integer> list) {
       if(index == arr.length-1){
        return list;
       }

       if(arr[index]==target){
        list.add(index);
       }

      return FindAll(arr, target, index+1, list);
       

    }

}
