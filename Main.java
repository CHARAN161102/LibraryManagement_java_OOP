//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        // Sample books and users
        library.addBook("Java Basics", "James Gosling");
        library.addBook("OOP Concepts", "Bjarne Stroustrup");
        library.registerUser("Alice");
        library.registerUser("Bob");

        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Display Books");
            System.out.println("2. Register User");
            System.out.println("3. Add Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String userName = sc.nextLine();
                    library.registerUser(userName);
                    System.out.println("User registered.");
                    break;
                case 3:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    System.out.println("Book added.");
                    break;
                case 4:
                    System.out.print("Enter your name: ");
                    userName = sc.nextLine();
                    System.out.print("Enter book title to borrow: ");
                    title = sc.nextLine();
                    library.borrowBook(userName, title);
                    break;
                case 5:
                    System.out.print("Enter your name: ");
                    userName = sc.nextLine();
                    System.out.print("Enter book title to return: ");
                    title = sc.nextLine();
                    library.returnBook(userName, title);
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
