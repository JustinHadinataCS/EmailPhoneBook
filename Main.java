import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<String> emailList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("****************************");
            System.out.println("(A)dd\n(D)elete\n(E)mail Search\n(P)rint List\n(S)earch\n(Q)uit\n");
            System.out.println("****************************");
            System.out.print("Please Enter a command: ");
            choice = scanner.nextLine().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    addEmail(scanner);
                    break;
                case 'D':
                    deleteEmail(scanner);
                    break;
                case 'E':
                    searchEmail(scanner);
                    break;
                case 'P':
                    printList();
                    break;
                case 'S':
                    searchItem(scanner);
                    break;
                case 'Q':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        } while (choice != 'Q');

        scanner.close();
    }

    private static void addEmail(Scanner scanner) {
        System.out.print("Enter email to add: ");
        String email = scanner.nextLine();
        emailList.add(email);
        System.out.println("Email added successfully.");
    }

    private static void deleteEmail(Scanner scanner) {
        System.out.print("Enter email to delete: ");
        String email = scanner.nextLine();
        if (emailList.remove(email)) {
            System.out.println("Email deleted successfully.");
        } else {
            System.out.println("Email not found.");
        }
    }

    private static void searchEmail(Scanner scanner) {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (String email : emailList) {
            if (email.contains(keyword)) {
                System.out.println("Email found: "  +email);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching email found.");
        }
    }

    private static void printList() {
        System.out.println("Email List:");
        for (String email : emailList) {
            System.out.println(email);
        }
    }

    private static void searchItem(Scanner scanner) {
        System.out.print("Enter item to search: ");
        String item = scanner.nextLine();
        System.out.println("Item search result...");
    }
}
