/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author blazquez.asier
 */
public class Book {
   // The private instance variables
   private String name;
   //private Author author;
   private double price;
   private int qty;
 
  private Author[] authors;

   
   /** Constructs a Book instance with the given author */
   public Book(String name, Author[] authors, double price, int qty) {
      this.name = name;
      this.authors = authors;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   /** Returns the name of this book */
   public String getName() {
      return name;
   }
   /** Return the Author instance of this book */
   public Author getAuthor(int i) {
      return authors[i];  // return member author, which is an instance of the class Author
   }
   /** Returns the price */
   public double getPrice() {
      return price;
   }
   /** Sets the price */
   public void setPrice(double price) {
      this.price = price;
   }
   /** Returns the quantity */
   public int getQty() {
      return qty;
   }
   /** Sets the quantity */
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
   String    s="LIBURUA\n" +
"  Izena: "+name+"\n" +
"  Autorea: "+Arrays.toString(authors)+"\n" +
"  Prezioa: "+price+"\n" +
"  Kantitatea: "+qty+"\n\n";
      return s;
   }
}