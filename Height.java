
import java.util.Map;
import java.util.TreeMap;

public class Height {
    public static void main(String[] args) {
         String[] name ={"sandip","rohit","jagruti","shital"};
         int[] height={167,175,163,155};
         insert(name, height);
    }

    public static void insert(String[] name,int[] Height){

        String[] ans =new String[name.length];
        Map<Integer,String> map=new TreeMap<>();
        for(int i=0;i<Height.length;i++){
            map.put(Height[i],name[i]);
        }
        int count = name.length-1;
        for(Map.Entry<Integer,String> mp:map.entrySet() ){
            if(count==-1){
              break;
            }
        ans[count--]=mp.getValue();
        }

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        

        
    }
}
