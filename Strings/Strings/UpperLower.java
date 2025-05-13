import java.util.*;
public class UpperLower {
    public static String toggle(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(toggle(input));
    }
}
