import java.util.*;
public class ASCII2 {
    public static String diff(String str){
        StringBuilder result = new StringBuilder();
        for(int  i = 0;i<str.length()-1;i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            int diff = ch2-ch1;
            result.append(ch1);
            result.append(diff);
            

        }
        result.append(str.charAt(str.length()-1));
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(diff(input));
        
    }
}
