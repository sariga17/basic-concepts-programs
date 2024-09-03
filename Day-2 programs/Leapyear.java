import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year to check:");
        int year= scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("this year is leap year:"+year);
            }
        }
        System.out.println("this year is not leap year:"+year);

        scanner.close(); 
    }
}

