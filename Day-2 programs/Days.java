import java.util.Scanner;
public class Days{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        switch(n){
            case 1:
                System.out.println("1 sunday");
                break;
            case 2:
                System.out.println("2 monday");
                break;
            case 3:
                System.out.println("3 tuesday");
                break;
            case 4:
                System.out.println("4 wednesday");
                break;
            
            case 5:
                System.out.println("5 thursday");
                break;
            case 6:
                System.out.println("6 friday");
                break;
            case 7:
                System.out.println("7 saturday");
                break;
            default:
                System.out.println("invalid input: enter value between 1 and 7");
                break;
        }
    }
}
