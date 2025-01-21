public class j7 {
    public static void main(String args[]){
        int n =23 ;
        int x =n;
        int sum1=0;
        while(n>0){
            int lstdgt = n%10;
           
            n=n/10;
            sum1=sum1+lstdgt;
        }
        if(x%sum1 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
}
}
