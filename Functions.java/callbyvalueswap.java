public class callbyvalueswap {
    public static void swapp(int a, int b){
        int temp = a;
        a = b; 
        b = temp;
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        
        swapp(a, b);
    }
}
