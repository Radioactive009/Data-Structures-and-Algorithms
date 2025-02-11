import java.util.*;
public class Typecasting2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the double number : ");
        double a = scanner.nextDouble();
        int b = (int)a;
        System.out.print("Value of double Typecasted into int is : "+b);
    }
}
