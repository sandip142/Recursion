
import java.util.HashMap;
import java.util.Map;
public class test {
    public static void main(String[] args) {
        String st="ba";
        String s= st.substring(2,2);
        System.out.println(s); 

        Map<Integer,Character> mp = new HashMap<>();
        mp.put(1,'a');
        mp.put(2, 'c');

        System.out.println(mp.get(2));
    }
}
