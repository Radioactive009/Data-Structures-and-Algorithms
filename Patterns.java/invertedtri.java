public class invertedtri {
    public static void main(String[] args){
        for(int i = 1;i<=5;i++){
            for(int j = i; j<=5-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
