/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.model;

/**
 *
 * @author Tisanai.Cha
 */
public class BookCatalog {

    private int numOfBooks;
    private Book[] books;

    public BookCatalog(int lengthOfCatalog) {
        books = new Book[lengthOfCatalog];
    }

    public int size() {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        int sum = 0;
        if (numOfBooks < books.length) {
            books[numOfBooks] = bookAdded;
            sum = numOfBooks;
            numOfBooks++;
        } else {
            sum = -1;
        }
        return sum;
    }

    public int unAvailableBook(Book bookUnAvailable) {
        int sum = -1;
        for (int i = 0; i < numOfBooks; i++) {
            if (bookUnAvailable.equals(books[i])) {
                books[i].setAvailable(false);
                sum = i;
                break;

            }

        }
        return sum;
    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
