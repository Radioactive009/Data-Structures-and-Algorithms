import java.util.*;
public class sumNatural{
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int  sum = 0;
        int i = 0;
        while(i<=n){
            sum = sum+i;
            
            i++;
        }
        System.out.println("The sum is: "+sum);
    }
}