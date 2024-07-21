import java.util.HashMap;
import java.util.Map;

public class check {
    public static void main(String[] args) {
        int arr[] ={1,4,2,1,2};
        System.out.println(nonRepeat(arr));
        Mapping(arr);
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        // System.out.println(isPrefixString(s,words));
        isPrefixString(s, words);

    }

    public static int nonRepeat(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
             ans= ans^arr[i];
        }

        return ans;
    }

    public static void Mapping(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }



        int ans=0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue()==1){
                ans=mp.getKey();
            }
        }

    }

    public static void isPrefixString(String s, String[] words) {

        String ans ="";
        int count=0;
        for(int i=0;i<words.length;i++){
            ans=ans+words[i];
            System.out.println(ans);
            if(ans.equals(s)){
              count++;
            }
            System.out.println(count);
        }

        // if(count>0){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}

