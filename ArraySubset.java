import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
       List<List<Integer>> ans = subsetDuplicate(arr);
       for(List<Integer> num: ans){
          System.out.println(num);
       }
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();  //created a new outer Arraylist
        outer.add(new ArrayList<>());//adding empty list to outer list as an starting point


        //for retriving every element from array
        for(int num:arr){
             int n = outer.size();  //getting the size of outer array to use that for internal for loo
             for(int i =0;i<n;i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));//getting all elements of outerlist
                internal.add(num); //adding element of array in internal list with previous present element
                outer.add(internal);//adding all interal element in outer loop
             }
        }   
    return outer;
    }

    public static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();  //created a new outer Arraylist
        outer.add(new ArrayList<>());//adding empty list to outer list as an starting point
        int start =0;
        int end =0;        

        //for retriving every element from array
        for(int j=0;j<arr.length;j++){
            //getting the size of outer array to use that for internal for loop
            start =0;
             if(j>0 && arr[j]>arr[j-1]){
                 start = end+1;
             }

             end = outer.size()-1;
             int n = outer.size();
             for(int i =start;i<n;i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));//getting all elements of outerlist
                internal.add(arr[j]); //adding element of array in internal list with previous present element
                outer.add(internal);//adding all interal element in outer loop
             }
        }   
    return outer;
    }
}
