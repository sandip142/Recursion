import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
       
        Arrange("","abc");
        System.out.println(ArrangeList("","abc"));
        System.out.println(ArrangeCount("","12256"));
    }
  static int count=0;
    public static void Arrange(String p,String up){
        if(up.isEmpty()){
            count++;
            System.out.println((count)+") "+p);
            return;
        }
         char ch =up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i,p.length());
            Arrange(f+ch+s, up.substring(1));
        }
    }
    public static ArrayList<String> ArrangeList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
         char ch =up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i,p.length());
            ans.addAll(ArrangeList(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    public static int ArrangeCount(String p,String up){
        
        if(up.isEmpty()){
            return 1;
        }

        int num =0; 

         char ch =up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i,p.length());
          num=  num+  ArrangeCount(f+ch+s, up.substring(1));
        }
        return num;
    }
}
