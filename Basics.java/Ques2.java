import java.net.SocketPermission;
import java.util.*;
public class Ques2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side : ");
        int side =  scanner.nextInt();
        int area = side*side;
        System.out.print("The area of square is : "+area);
    }
}
