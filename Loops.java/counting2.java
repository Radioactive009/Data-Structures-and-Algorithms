import java.util.*;
public class counting2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int  n = scanner.nextInt();
        int i =  0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
}
