package com.MiniProject_LibraryManagement;

import java.util.Scanner;

public class LibraryManagementApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book("B101", "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("B102", "1984", "George Orwell"));
        library.addBook(new Book("B103", "Clean Code", "Robert C. Martin"));

        Member member1 = new Member("M001", "Raafiya");
        Member member2 = new Member("M002", "Aarav");

        int choice;
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Calculate Late Fee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.displayBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    String bookId = sc.next();
                    System.out.print("Enter Member ID (M001/M002): ");
                    String mid = sc.next();
                    Member member = mid.equals("M001") ? member1 : member2;
                    library.issueBook(bookId, member);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    String bookId = sc.next();
                    System.out.print("Enter Member ID: ");
                    String mid = sc.next();
                    Member member = mid.equals("M001") ? member1 : member2;
                    try {
                        library.returnBook(bookId, member);
                    } catch (InvalidBookReturnException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.print("Enter number of late days: ");
                    int days = sc.nextInt();
                    library.calculateLateFee(days);
                }
                case 5 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
