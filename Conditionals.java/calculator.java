import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char c = scanner.next().charAt(0);
        switch (c) {
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            default: System.out.println("Your calculator is not working!!!");
                break;
        }
    }
}
