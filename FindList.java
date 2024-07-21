import java.util.*;

public class FindList {
    public static void main(String[] args) {
        int[] arr ={2,3,4,2,5,6,2,11,3,5,11,3,2,3,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
      System.out.println(  Search(arr, 0, 2));
    }

    public static ArrayList<Integer> SearchList(int[] arr,int index,int target,ArrayList<Integer> result){

         //ArrayList<Integer> list = new ArrayList<Integer>();
        if(index==arr.length-1){
            return result;
        }
        if(arr[index]==target){
            result.add(index);
        }

        return SearchList(arr, index+1, target, result);
        

    }

    public static ArrayList<Integer> Search(int[] arr,int index,int target){

        ArrayList<Integer> list = new ArrayList<Integer>();
       if(index==arr.length-1){
           return list;
       }

       //adding the element for only that petcular element
       if(arr[index]==target){
           list.add(index);
       }

       ArrayList<Integer> collectorBelowList = Search(arr, index+1, target);
    
       list.addAll(collectorBelowList);

       return list;

   }
}
