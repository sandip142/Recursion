public class PrintSeries {
    public static void main(String[] args) {
        Series(2, 10);
    }
    public static void Series(int n,int m ){
        if(n==m){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Series(n+1,m);
    }
}
