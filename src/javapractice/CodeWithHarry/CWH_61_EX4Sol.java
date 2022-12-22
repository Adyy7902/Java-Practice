package CodeWithHarry;

class Library{
    String[] books;
    int noOfBooks;
    public Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void addBook(String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book + " has been added!");
    }
    void showAvailableBook(){
        System.out.println("Available books are: ");
        for (String book : this.books){
            if(book == null){
                continue; // if there is any null encountered it will leave that and continue to find other books
            }
            System.out.println("* " + book);
            
        }
    }
    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i].equals(book)){
                System.out.println(book + " has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This  book doesn't exist");
    }
    void returnBook(String book){
        this.books[noOfBooks] = book;
        System.out.println(book + " has been returned!");
    }
}
       
public class CWH_61_EX4Sol {
    public static void main(String[] args) {
        //You have to implement a library using java Class 
        //Methods - addBook, issueBook, returnBook, showAvailableBooks
        //Prperties - Array to store available books, Array to store issued books
        //
        
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBook();
        centralLibrary.issueBook("C++");     
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBook();
        
    }
    
}
