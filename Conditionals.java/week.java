import java.lang.runtime.SwitchBootstraps;
import java.util.*;
public class week {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int week = scanner.nextInt();
        switch (week) {
            case 1:  System.out.println("Sunday") ;

                break;
            case  2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
        
            default: System.out.println("Abbe laude 1-7 ke beech ka number daal na");
                break;
        }
    }
}
