import java.util.Scanner;

public class BMI { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight:");
        double weight = scanner.nextDouble();

        System.out.println("Enter the height:");
        double height = scanner.nextDouble();
        if (height <= 0) {
            System.out.println("Height must be greater than zero.");
            scanner.close();
            return;
        }

        double bmi = weight / (height * height);
        String result;
        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            result = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            result = "Overweight";
        } else {
            result = "Obesity";
        }

        System.out.printf("Your BMI is: %.2f\n", bmi); 
        System.out.println("Your BMI category is: " + result);

        scanner.close();
    }
}
