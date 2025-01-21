public class j4 {
    public static void main(String args[]){
        int n =1548 ;
        int sum1=0;
        int sum2=0;
        while(n>0){
            int lstdgt = n%10;
            if(lstdgt %2 == 0){
                sum1 =sum1+lstdgt;
            }else{
                sum2 =sum2+lstdgt;
            }
            n=n/10;
        }

        System.out.print("even sum" + sum1);
        System.out.println();
        System.out.print("even sum" + sum2);
    }
}
