import java.util.*;
public class pallindrome {
    public static boolean isPallindrome(String str){
        for(int i  = 0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        System.out.print(isPallindrome(input));
        scanner.close();
}
}
