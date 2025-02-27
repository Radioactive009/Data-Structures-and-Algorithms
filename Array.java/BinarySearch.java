public class BinarySearch {
    public static int BS(int number[], int key){
        int start = 0;int end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key == number[mid]){
                return mid;
            } else if(key<number[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {11,23,55,57,89,88,78,55,56,21};
        int key = 55;
       
        System.out.println("Index of the key is: "+BS(number, key));
}
}
