import java.awt.print.Book;
import java.util.Arrays;

public class LibraryLesson7 {
    public BookLesson7[] bookLesson7s = new BookLesson7[10];
    private int count = 0;

    public void addBook (BookLesson7 bookToBeAddded) {
        bookLesson7s[count] = bookToBeAddded;
        count++;
    }

    public void deleteBook(String bookNameToDelete) {
        for (int i = 0; i < bookLesson7s.length; i++) {
            if (bookLesson7s[i].name.equals(bookNameToDelete)) {
                for (int j = i; j < bookLesson7s.length - 2; j++) {
                    bookLesson7s[j] = bookLesson7s[j+1];
                }
                count--;
                return;
            }
        }
    }

    public boolean updateBook (String nameBook, int year) {
        for (int i = 0; i < bookLesson7s.length; i++) {
            if (bookLesson7s[i].name.equals(nameBook)) {
                bookLesson7s[i].year = year;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "LibraryLesson7{" +
                "bookLesson7s=" + Arrays.toString(bookLesson7s) +
                ", count=" + count +
                '}';
    }
}
