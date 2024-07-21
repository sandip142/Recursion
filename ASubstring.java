public class ASubstring {
    public static void main(String[] args) {
        Skip("","sandipkankhare");
        System.out.println(SkipApples("sadipapplekankhare"));
        System.out.println(SkipAppNotApples("sadipapplekankhare"));
        System.out.println(SkipAppNotApples("sadipappekankhare"));
    }

    public static void Skip(String s,String up){
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }

        char ch = up.charAt(0);
        if(ch =='a'){
             Skip(s,up.substring(1));
        }else{
             Skip(s+ch, up.substring(1));
        }
    }

    public static String Skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch =='a'){
             return Skip2(up.substring(1));
        }else{
            return ch + Skip2(up.substring(1));
        }
    }

    public static String SkipApples(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
             return SkipApples(up.substring(5));
        }else{
            return up.charAt(0)+SkipApples(up.substring(1));
        }
    }

    public static String SkipAppNotApples(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return SkipAppNotApples(up.substring(3));
        }else{
            return up.charAt(0)+SkipAppNotApples(up.substring(1));
        }
    }
}
