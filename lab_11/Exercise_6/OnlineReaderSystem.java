package lab_11.Exercise_6;
import java.util.*;

public class OnlineReaderSystem {
    private Library library;
    private UserManager userManager;
    private Display display;
    private String currentBook;

    public OnlineReaderSystem() {
        library = new Library();
        userManager = new UserManager();
        display = new Display();
        currentBook = null;
    }

    public void startToUse() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            display.showMessages("Welcome to the Online Reading System!");
            display.showMessages("1. Create new session");
            display.showMessages("2. Read a book");
            display.showMessages("3. Log out");
            display.showMessages("4. Exit the system");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createUser(scanner);
                    break;
                case 2:
                    readBook();
                    break;
                case 3:
                    logout();
                    break;
                case 4:
                    System.out.println("Thank you for using Online Reading System!");
                    System.exit(0);
                    break;
                    default:
                        display.showMessages("Invalid choice");
            }
        }
    }

    private void createUser(Scanner scanner) {
        if (userManager.checkUsersActivity()) {
            display.showMessages("Sorry, system is already using!");
        }
        System.out.println("Enter you username: ");
        String username = scanner.nextLine();
        userManager.createUser(username);
    }

    private void readBook() {
        if (!userManager.checkUsersActivity()) {
            display.showMessages("Please, log in!");
            return;
        }
        if (currentBook != null) {
            display.showMessages("You have book to read, finish doing this");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        library.showBooks();
        display.showMessages("Write the title of the book to start reading: ");
        String title = scanner.nextLine();
        if (library.isBookAvailable(title)) {
            currentBook = title;
            display.showBookDescription(library.getBookContent(title));
        } else {
            display.showMessages("That book is not available");
        }
    }

    private void logout() {
        if (userManager.checkUsersActivity()) {
            userManager.logoutUser();
            display.showMessages("You logged out");
            currentBook = null;
        } else {
            display.showMessages("No user is logged in");
        }
    }
    public static void main(String[] args) {
        OnlineReaderSystem system = new OnlineReaderSystem();
        system.startToUse();
    }
}

