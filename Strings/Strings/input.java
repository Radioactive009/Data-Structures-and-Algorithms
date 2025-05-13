import java.util.*;
public class input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        System.out.println(name);
         System.out.print(name.length());
         scanner.close();
    }
}