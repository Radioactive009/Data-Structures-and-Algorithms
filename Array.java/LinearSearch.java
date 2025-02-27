
public class LinearSearch {
    public static int Lin(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {2,3,5,9,10,12,20,25,29,28};
        int key = 100;
        int index = Lin(number, key);
        if(index == -1){
            System.out.println("Not found!");
        } else {
            System.out.println("Key is found at index: "+index);
        }
    }
}
// Time complexity is Big oH of N O(n)
