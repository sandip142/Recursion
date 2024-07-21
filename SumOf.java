// n=3241 => 3+2+4+1 =10


public class SumOf {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(3241));
    }

    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }

        return (n%10)+sumOfDigit(n/10);
    }
}
