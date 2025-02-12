import java.util.*;
public class taxcalc {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter income : ");
        double income = scanner.nextDouble();
        double tax = 0;
        if(income<=500000){
            System.out.println("Your income is : "+tax);
        }
        else if(income>=60000 && income<1000000){
            tax = income - (0.20*income);
            System.out.println("Your income is : "+tax);
        }
        else{
            tax = income-(0.30*income);
            System.out.println("Your income is : "+tax);
        }
    }
}
