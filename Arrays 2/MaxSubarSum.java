public class MaxSubarSum{
    public static void Maxsum(int arr[]){
        int maxsum = 0;
        int currsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
                int end = j;
                currsum = 0;
                for(int k = start;k<=end;k++){
                    currsum = arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Sum = "+maxsum);
    }
    public static void main(String[] args){
        int arr[] = {2,4,5,6,9,8,7};
        Maxsum(arr);
    }
}