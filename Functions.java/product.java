public class product {
    // public static void productt(int  a, int  b){
    //     int c = a*b;
    //     System.out.println("Product of a&b = "+c);
    // }
    // public static void main(String[] args){
    //     int  a = 5;
    //     int  b = 40;
    //     productt(a, b);
    // }

    public static int multiply(int a, int b){
        int mult = a*b;
        return mult;
    }
    public static void main(String[]  args){
        int a = 10;
        int b = 40;
        int prod = multiply(a, b);
        System.out.println("a*b: "+prod);
    }
}
