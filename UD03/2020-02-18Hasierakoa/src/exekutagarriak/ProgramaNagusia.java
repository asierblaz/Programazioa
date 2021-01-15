package exekutagarriak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;
import model.Komikia;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {

        Author rowling = new Author("J.K.Rowling", 'f');
        liburutegia.add(new Book("Harry Potter", rowling, 99.99, 2850));

        Author cris = new Author("Agatha Christie", 'f');
        
        liburutegia.add(new Book("Asesinato en el Oriente Express", cris, 9.95, 275));
        liburutegia.add(new Book("Muerte en el Nilo", cris, 9.95, 300));
        liburutegia.add(new Book("10 negritos", cris, 9.95, 325));

        Author ibanez = new Author("Francisco Ibañez", 'm');
        liburutegia.add(new Komikia(true, "Mortadelo y Filemon", ibanez, 19.95, 75));

        Author atwood = new Author("Margaret Atwood", 'f');
        liburutegia.add(new Book("El cuento de la criada", atwood, 24.95, 410));
        liburutegia.add(new Book("Cat's eye", atwood, 6.95, 78));

        Author satrapi = new Author("Marjane Satrapi", 'f');
        liburutegia.add(new Komikia(true, " Persepolis", satrapi, 19.95, 75));

        Author landa = new Author("Mariasun Landa", 'f');
        liburutegia.add(new Book("Azken Balada", landa, 10.95, 225));

        Author lee = new Author("Harper Lee", 'f');
        liburutegia.add(new Book("Matar a un ruiseñor", lee, 15.95, 450));

        Author mary = new Author("Mary Shelley", 'f');
        liburutegia.add(new Book("Frankesnstein", mary, 19.95, 300));

    }

    public static void jaiotzeDataBete() {

    }

    public static void inprimatu() {
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b : liburutegia) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();

    }

}
