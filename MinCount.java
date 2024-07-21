public class MinCount{
    public static void main(String[] args) {
       System.out.println(minCount(65, 4, 0));
     System.out.println(minMoves(9, 1));
    }
   public static int minCount(int target,int maxcount,int steps){
    if(target==1){
        return steps;
    }

    if(target%2==0 && maxcount!=0){
        return minCount(target/2, maxcount-1, steps+1);
    }

     

    return minCount(target-1, maxcount, steps+1);
   }

   public static int minMoves(int target,int maxDoubles){
    int steps =0;

    while (target!=1) {
        if(target%2==0 && maxDoubles!=0){
            target = target/2;
            maxDoubles--;
            steps++;
        }else{
            target =target-1;
            steps++;
        }
    }

    return steps;
   }


}