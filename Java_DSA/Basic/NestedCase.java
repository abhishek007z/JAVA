//Nested Switch case:-
import java.util.Scanner;

public class NestedCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employID : ");
        int empID = in.nextInt();
        System.out.print("Enter the department : ");
        String department = in.next();

        switch(empID) {
            case 1 -> {
                System.out.println("Raj");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    default -> System.out.println("No Department");
                }
            }
            case 2 -> {
                System.out.println("Radhika");
                switch (department) {
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("No Department");
                }
            }
            case 3 -> {
                System.out.println("Sneha");
                switch (department) {
                    case "Finance" -> System.out.println("Finance Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Invalid Employee ID");
        }
        in.close();
    }
}
