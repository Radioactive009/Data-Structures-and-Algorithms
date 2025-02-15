import java.util.*;
public class table {
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int table = 1;
        int i = 1;
        while(i<=10){
            table = n*i;
            System.out.println(table);
            i++;
        }

        
    }
}
