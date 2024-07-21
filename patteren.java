public class patteren {
    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k <= 5 - i - 1; k++) {
                if(i==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for (int k = 0; k <= 5 - i - 1; k++) {
                if(i==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= 5 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 5 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
             System.out.println();
        }
        System.out.println();
        Triangle(5, 0);
        Triangle2(5, 0);

    }

    public static void  Triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            Triangle(r, c+1);
        }else{
            System.out.println();
            Triangle(r-1, 0);
        }
    }

    public static void  Triangle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            Triangle2(r, c+1);
            System.out.print("* ");
          
        }else{
            
            Triangle2(r-1, 0);
            System.out.println();
        }
    }
}
