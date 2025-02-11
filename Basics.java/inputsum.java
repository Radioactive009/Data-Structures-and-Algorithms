import java.util.*;
public class inputsum {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b : ");
        int b = scanner.nextInt();
        
        int sum = a+b;
        System.out.println("The sum of a and b = "+sum);
    }
}
