package com.Day4Hw.H2;

class Author {
    String name;
    String email;
    char gender;

    Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    void displayAuthor() {
        System.out.println("Author Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    Book(String n, Author a, double p, int q) {
        name = n;
        author = a;
        price = p;
        qtyInStock = q;
    }

    // Getters
    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    void setName(String n) {
        name = n;
    }

    void setAuthor(Author a) {
        author = a;
    }

    void setPrice(double p) {
        price = p;
    }

    void setQtyInStock(int q) {
        qtyInStock = q;
    }

    void displayBook() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
        System.out.println("---- Author Details ----");
        author.displayAuthor();
    }
}

public class Main {
    public static void main(String[] args){
        Author author = new Author("Chetan Bhagat", "chetan@example.com", 'M');
        Book book = new Book("2 States", author, 299.50, 50);

        System.out.println("---- Book Details ----");
        book.displayBook();
    }
}
