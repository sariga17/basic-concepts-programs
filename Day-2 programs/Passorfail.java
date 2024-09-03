import java.util.Scanner;
public class Passorfail{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a mark:");
        int mark=s.nextInt();
        System.out.println(mark>=50? "pass":"fail");
    }
    
}
