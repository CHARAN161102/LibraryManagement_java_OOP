import java.util.ArrayList;
import java.util.List;

    public class User {
        private String name;
        private List<Book> borrowedBooks = new ArrayList<>();

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void borrowBook(Book book) {
            borrowedBooks.add(book);
        }

        public void returnBook(Book book) {
            borrowedBooks.remove(book);
        }

        public void displayBorrowedBooks() {
            System.out.println(name + "'s Borrowed Books:");
            for (Book book : borrowedBooks) {
                System.out.println(" - " + book.getTitle());
            }
        }
    }


