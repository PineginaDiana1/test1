public class Lesson7 {
    public static void main(String[] args) {
        BookLesson7 book1 = new BookLesson7("hgjhg", 1998);
        BookLesson7 book2 = new BookLesson7("hgjkjghg", 1999);
        BookLesson7 book3 = new BookLesson7("ddhgjhg", 1997);

        LibraryLesson7 library = new LibraryLesson7();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.updateBook("hgjhg", 2000);
        library.deleteBook("ddhgjhg");

        System.out.println(library);
    }
}
