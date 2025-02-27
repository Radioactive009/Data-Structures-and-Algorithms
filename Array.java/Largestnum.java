public class Largestnum{
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if(minimum>number[i]){
                minimum = number[i];
            }
        }

        return largest;
    }
    public static void main(String[] args){
        int number[] = {23,25,66,21,89,87,56,99,85};
        System.out.println("The largest number in the array is: "+getLargest(number));
    }
}