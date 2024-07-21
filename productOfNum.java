//3421 => 3*4*2*1 =24

public class productOfNum {
    public static void main(String[] args) {
       System.out.println(productNum(3421));   
    }

    public static int productNum(int n){
        if(n==(n%10)){
            return n;
        }

        return (n%10)*productNum(n/10);
    }
}
