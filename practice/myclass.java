package practice;
import java.util.*;
public class myclass{
    public static void main(String arg[]) throws Exception{
        
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        if(w%2==0 && w != 2){
            System.out.println("YES");
        }else{
             System.out.println("NO");
        }
        in.close();
    }
}