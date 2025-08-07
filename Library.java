import java.util.ArrayList;
import java.util.List;

    public class Library {
        private List<Book> books = new ArrayList<>();
        private List<User> users = new ArrayList<>();

        public void addBook(String title, String author) {
            books.add(new Book(title, author));
        }

        public void registerUser(String name) {
            users.add(new User(name));
        }

        public void displayBooks() {
            System.out.println("Books in Library:");
            for (Book book : books) {
                System.out.println(" - " + book);
            }
        }

        public User getUserByName(String name) {
            for (User user : users) {
                if (user.getName().equalsIgnoreCase(name)) {
                    return user;
                }
            }
            return null;
        }

        public Book getBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
            return null;
        }

        public void borrowBook(String userName, String bookTitle) {
            User user = getUserByName(userName);
            Book book = getBookByTitle(bookTitle);

            if (user != null && book != null && book.isAvailable()) {
                book.borrow();
                user.borrowBook(book);
                System.out.println(userName + " borrowed " + bookTitle);
            } else {
                System.out.println("Borrowing failed. Either user/book not found or book is unavailable.");
            }
        }

        public void returnBook(String userName, String bookTitle) {
            User user = getUserByName(userName);
            Book book = getBookByTitle(bookTitle);

            if (user != null && book != null && !book.isAvailable()) {
                book.returnBook();
                user.returnBook(book);
                System.out.println(userName + " returned " + bookTitle);
            } else {
                System.out.println("Return failed. Either user/book not found or book was not borrowed.");
            }
        }
    }


