import java.util.Scanner;

public class Ques3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost of Pencil : ");
        int Pencil = scanner.nextInt();
        System.out.print("Enter the cost of pen : ");
        int Pen = scanner.nextInt();
        System.out.print("Enter the cost of Eraser : ");
        int  Eraser = scanner.nextInt();
        double totalcost = Pencil+Pen+Eraser;
        double gst = totalcost+0.18;
        System.out.print("Total cost after adding gst in it : "+gst);
    }
}
