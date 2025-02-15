public class breakloop {
    public static void main(String[] args){
        for(int i = 1;i<=5;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.print("I am out of the loop, break statement worked!!");
    }
}
