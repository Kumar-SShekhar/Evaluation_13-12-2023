import java.util.*;
class Divide {
    public static void main(String[] args) {
        int num=10;
        for(int i=0;i<4;i++){
            try{
                int result=num/i;
                System.out.println(" result is: " + result);
            }
            catch(Exception e){
                System.out.println("Exception: " + e.toString());
                System.out.println(" result -1" );
            }
        }
    }
}