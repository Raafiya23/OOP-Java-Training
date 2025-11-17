package com.MiniProject_LibraryManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, String> issuedBooks = new HashMap<>();
    private FileWriter logWriter;

    public Library() {
        try {
            logWriter = new FileWriter("com/MiniProject_LibraryManagement/library_log.txt", true);
        } catch (IOException e) {
            System.out.println("Log file could not be created.");
        }
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
        log("Added Book: " + book);
    }

    public void issueBook(String bookId, Member member) {
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book already issued!");
            return;
        }
        book.setIssued(true);
        issuedBooks.put(bookId, member.getMemberId());
        log("Issued Book: " + book + " to " + member);
        System.out.println("Book issued successfully!");
    }

    public void returnBook(String bookId, Member member) throws InvalidBookReturnException {
        Book book = books.get(bookId);
        if (book == null || !book.isIssued()) {
            throw new InvalidBookReturnException("Invalid return! Book not issued.");
        }
        if (!issuedBooks.get(bookId).equals(member.getMemberId())) {
            throw new InvalidBookReturnException("This book was not issued to " + member.getName());
        }
        book.setIssued(false);
        issuedBooks.remove(bookId);
        log("Returned Book: " + book + " by " + member);
        System.out.println("Book returned successfully!");
    }

    public void displayBooks() {
        System.out.println("\n=== Library Books ===");
        for (Book b : books.values()) {
            System.out.println(b);
        }
    }

    public void calculateLateFee(int daysLate) {
        int feePerDay = 10;
        int total = daysLate * feePerDay;
        System.out.println("Late fee: ₹" + total);
    }

    private void log(String message) {
        try {
            logWriter.write(message + "\n");
            logWriter.flush();
        } catch (IOException e) {
            System.out.println("Error writing to log file.");
        }
    }
}
