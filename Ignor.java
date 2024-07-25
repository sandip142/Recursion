import java.util.HashSet;
public class Ignor {
    public static void main(String[] args) {
    //     String s = "@sndip&k*ankhare*";
    //     Stack<Character> ch =new Stack<>();
    //     Map<Integer,Character> map = new HashMap<>();
    //     for( int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='@'||s.charAt(i)=='&'||s.charAt(i)=='!'||s.charAt(i)=='#'||s.charAt(i)=='$'||s.charAt(i)=='%'||s.charAt(i)=='^'||s.charAt(i)=='*'||s.charAt(i)=='?'){
    //             map.put(i,s.charAt(i));
    //         }else{
    //             ch.push(s.charAt(i));
    //         }
          
    //     }
           
    //   String ans="";
    //    for(int i=0;i<s.length();i++){
    //     char g ;
    //       if(map.containsKey(i)){
    //         g = map.get(i);
    //        System.out.println(g);
    //       }else{
    //         g= ch.pop();
    //       }
    //      ans=ans+g; 
    //    }

    //    System.out.println(ans);

    System.out.println(add(10));
     }

    public static boolean add(int c){

      boolean result=false;  
      int high = (int) Math.sqrt(c);
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0;i<=high;i++){
        hs.add(i*i);
      }
    
      for(int i=0;i<=high;i++){
        int ans = c-(i*i);
        if(hs.contains(ans)){
            result=true;
            break;
        }
      }
    return result;
  }
}
