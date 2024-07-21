public class reverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(3421));
    }


    static int ans=0;
    public static int reverse(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        ans=ans*10+rem;
        reverse(n/10);
        return ans;
    }
}
