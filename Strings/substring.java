public class substring {
    public static String substringg(String str, int si, int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        System.out.print(substringg(str, 0, 5));
    }
}
