class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

void addBook(String book){
        this.books[no_of_books ] = book;
        no_of_books++;
    System.out.println(book + " has been added!");
}
void showAvailableBooks() {
    System.out.println("Available books are:");
    for (String book : this.books) {
        if (book == null)
            continue;
        System.out.println("* " + book);
    }
}
void issueBook(String book){
        for (int i = 0; i < this.books.length; i++){
        if (this.books[i].equals(book)) {
            System.out.println("The book has been issued!");
            this.books[i] = null;
            return;
        }
    }
        System.out.println("This book does not exist");
}
void returnBooks(String book){
        addBook(book);
}
}

public class cwh_vd61 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class Library
        // methods: addBook, issueBook, returnBook
        // properties: Array to store the available books,
        //Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.returnBooks("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.showAvailableBooks();
    }
}
