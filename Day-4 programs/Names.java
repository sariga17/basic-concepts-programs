import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numOfNames = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[numOfNames];
        System.out.println("Enter the Names:");
        for (int i = 0; i < numOfNames; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        String longestName = names[0];
        String shortestName = names[0];
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.println("\nLongest name: " + longestName);
        System.out.println("Shortest name: " + shortestName);
        System.out.println("\nNames in reverse order:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        
        scanner.close();
    }
}
