import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // subsetOfcharInString("", "abc");
        // System.out.println();
        // System.out.println(listsubsetOfcharInString("","abc"));
        subsetAscii("","abc");
        System.out.println(listsubsetAscii("","abc"));

    }

    public static void subsetOfcharInString(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        subsetOfcharInString(p+up.charAt(0), up.substring(1));
        subsetOfcharInString(p, up.substring(1));
    }


    public static ArrayList<String> listsubsetOfcharInString(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

       ArrayList<String> Right =listsubsetOfcharInString(p+up.charAt(0), up.substring(1));
       ArrayList<String> left= listsubsetOfcharInString(p, up.substring(1));

       Right.addAll(left);
       return Right;
    }

    public static void subsetAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
         char ch = up.charAt(0);
         subsetAscii(p+up.charAt(0), up.substring(1));
         subsetAscii(p + (ch+0), up.substring(1));
         subsetAscii(p, up.substring(1));     
    }

    public static ArrayList<String> listsubsetAscii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
       char ch = up.charAt(0);
       ArrayList<String> Right =listsubsetAscii(p+up.charAt(0), up.substring(1));
       ArrayList<String> middlle= listsubsetAscii(p+ (ch+0), up.substring(1));
       ArrayList<String> left= listsubsetAscii(p, up.substring(1));

       Right.addAll(left);
       Right.addAll(middlle);
       return Right;
    }

}
