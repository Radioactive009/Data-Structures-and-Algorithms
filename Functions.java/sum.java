import java.util.*;
public class sum {
    public static int calculatesum(int  a, int b){ //  formal parameters
        int  sum = a+b;
        return  sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int  a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int  b = scanner.nextInt();
        int  sum = calculatesum(a,b);  // actual parameters
        System.out.println("Sum is "+sum);
    }
}
