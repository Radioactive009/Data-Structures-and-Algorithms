import java.util.*;
public class ASCII{
    public static String change(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i%2==0){
                result.append((char)(ch+1));
            }
            else{
                result.append((char)(ch-1));
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(change(input));
    }
}