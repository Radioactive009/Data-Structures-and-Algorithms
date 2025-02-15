import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int  num; 
        int fact = 1;
        System.out.print("Enter any positive number: ");
        num = scanner.nextInt();
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
