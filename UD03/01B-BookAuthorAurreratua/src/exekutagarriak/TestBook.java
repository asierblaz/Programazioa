/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Author;
import model.Book;

/**
 *
 * @author blazquez.asier
 */
public class TestBook {
   public static void main(String[] args) {
      // We need an Author instance to create a Book instance
      
      Author[] authors = new Author[2];
authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
      Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
      System.out.println(ahTeck);  // Author's toString()
      //Tan Ah Teck (m) at ahTeck@somewhere.com

      
      // Test Book's constructor and toString()
      Book dummyBook = new Book("Java for dummies", authors, 9.99, 99);
      System.out.println(dummyBook);  // Book's toString()
      //'Java for dummies' by Tan Ah Teck (m) at ahTeck@somewhere.com

      // Test Setters and Getters
      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      System.out.println("name is: " + dummyBook.getName());
      //name is: Java for dummies
      System.out.println("price is: " + dummyBook.getPrice());
      //price is: 8.88
      System.out.println("qty is: " + dummyBook.getQty());
      //qty is: 88
      System.out.println("author is: " + dummyBook.getAuthor(0));  // invoke Author's toString()
      //author is: Tan Ah Teck (m) at ahTeck@somewhere.com
      System.out.println("author's name is: " + dummyBook.getAuthor(0).getName());
      //author's name is: Tan Ah Teck
      System.out.println("author's email is: " + dummyBook.getAuthor(0).getEmail());
      //author's email is: ahTeck@somewhere.com
      System.out.println("author's gender is: " + dummyBook.getAuthor(0).getGender());
      //author's gender is: m

   }
}