import java.util.*;
public class integercheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>0){
            System.out.println(a+" is positive number");
        }
        else{
            System.out.println(a+" is negative number");
        }
    }
}
