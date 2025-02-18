public class pallindrome {
    public static void isPallindromee(int n){;
    int rev=  0;
    int original = n;
    int digit;
    while(n>0){
        digit= n%10;
        rev = rev*10+digit;
        n = n/10;
    }
    if(rev==original){
        System.out.println("it is pallindrome");
    }else{
        System.out.println("It's not a pallindrome");
    }
}
public static void main(String[] args){
    isPallindromee(122);
}


}
