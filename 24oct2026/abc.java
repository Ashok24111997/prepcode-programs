import java.util.*;
public class abc{
    public static void main(String args[]){
        int p =5;
        int q =7; 
        int r =8;
        for(r =4;r<=7;r++){
            if((p-q+r)<(r-p)){
                continue;
            }else{
                q=p^q;
                p = 3+12+r;
            }
            
            System.out.println(p+" "+q);
        }
        System.out.println(p+q);
    }
}
