import java.util.*;
public class halfpyramid {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of pyramid: ");
        int n = scanner.nextInt();
        for(int line = 1;line <= n; line++ ){
            for(int star = 1; star<=line; star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
