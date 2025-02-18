public class sumofdigits {
    public static int sumofd(int n){
        int rem;
        int digit=0;
        while(n>0){
            rem = n%10;
            digit = digit+rem;
            n  = n/10;
        }
        return digit;
    }
    public static void main(String[]  args){
        System.out.println(sumofd(122));
    }
}
