import java.util.*;


public class merge {
    public static void main(String[] args) {
        int[] arr = {3,6,8,5,9,4,2,7,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPalace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merger(first,second);
    }

    public static int[] merger(int[] first, int[] second) {
         int[] arr = new int[first.length+second.length];
         int i=0;
         int j=0;
         int k=0;
         
         while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                arr[k]=first[i];
                i++;
                k++;
            }else{
                arr[k]=second[j];
                j++;
                k++;
            }
         }

         while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
         }

         while(j<second.length){
             arr[k]=second[j];
             j++;
             k++;
         }


         return arr;
        
    }


    //second Approach of Merge Sort

    public static void mergeSortInPalace(int[] arr,int s,int e){
        if(e-s <= 1){
            return;
        }

        int mid = (s+e)/2;

          mergeSortInPalace(arr,s,mid);
           mergeSortInPalace(arr,mid,e);

       mergeInPlace(arr, s, mid, e);
    }

    public static int[] mergeInPlace(int[] arr,int s,int mid,int e) {
         int[] mix = new int[e-s];
         int i=s;
         int j=mid;
         int k=0;
         
         while(i<mid && j<e){
            if(arr[i]<=arr[j]){
                mix[k]=arr[i];
                i++;
                k++;
            }else{
                mix[k]=arr[j];
                j++;
                k++;
            }
         }

         while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
         }

         while(j<e){
             mix[k]=arr[j];
             j++;
             k++;
         }

        for(int l =0; l<mix.length;l++){
            arr[s+l]=mix[l];
        }
         return arr;

        
    }


}
