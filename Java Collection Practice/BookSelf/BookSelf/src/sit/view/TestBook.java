/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import self.model.Book;
import self.model.BookCatalog;

/**
 *
 * @author INT105
 */
public class TestBook {
    public static void main(String[] args) {
        BookCatalog bc = new BookCatalog(2);
        Book b1 = new Book (1,"Java","Programming",true);
    bc.addBook(b1);
        System.out.println(b1);
    }
    
}
