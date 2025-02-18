public class ncr {
    public static int ncrr(int n){
        int fact = 1;
        for(int  i = 1;i<=n;i++){
            fact= fact*i;
        }
        return  fact;
    }
    public static void main(String[] args){
        int k  = ncrr(5);
        int p = ncrr(3);
        int c = ncrr(2);
        int  bino = k/(p*c);
        System.out.println("Binomial coefficient: "+bino);
    }
}
