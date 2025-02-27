public class Howme {
    public static void menu(String items[], String key){
        for(int i=0;i<items.length;i++){
            if(items[i].equals(key)){
                System.out.print("Your favourite food item is: "+key);
            }
        }
    }
    public static void main(String[] args){
        String items[] = {"Samosa", "Biryani", "Raita", "Butter", "Roti"};
        String key = "Butter";
        menu(items, key);
    }
}
