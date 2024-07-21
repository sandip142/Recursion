public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }

    public static int Fact(int n){
        if(n<=1){
            return 1;
        }

        return n*Fact(n-1);
    }
}
