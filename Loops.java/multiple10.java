import java.util.*;
public class multiple10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int n = scanner.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}