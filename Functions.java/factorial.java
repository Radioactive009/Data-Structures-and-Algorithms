public class factorial{
    public static int fact(int n){
        int facto = 1;
        for(int  i  =1;i<=n;i++){
            facto = facto*i;
        }
        return facto;
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}