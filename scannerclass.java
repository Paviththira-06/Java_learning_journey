import java.util.Scanner;

public class scannerclass{
    public static void main(String[] args){
        
         Scanner in =new Scanner(System.in);
         int a;
         System.out.print("Enter a no:");
         a=in.nextInt();
         System.out.print("Value:"+a);
         in.close();
    
         
    }
}
