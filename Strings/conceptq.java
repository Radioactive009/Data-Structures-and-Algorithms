public class conceptq {
    public static float getShortesPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir=='s'){
                y--;
            }
            // North
            else if(dir=='N'){
                y++;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        int x2  = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args){
        String path = "WWWWWNSNNSE";
        System.out.print(getShortesPath(path));
    }
}
