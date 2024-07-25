public class ClimbStairs {
    public static void main(String[] args) {
      System.out.println(stair2(3));
    }

    public static int stairs(int n){
      if(n==0){
        return 1;
      }
      if(n<0){
        return 0;
      }

      return stairs(n-1)+stairs(n-2);
    }

    public static int stair2(int n){

        if(n==0||n==1){
            return 1;
        }
        int one =1;
        int two =1;
        int temp;
        for(int i=2;i<=n;i++){
            temp=two;
            two = one +two;
            one=temp;
        }

        return two;
    }
}
