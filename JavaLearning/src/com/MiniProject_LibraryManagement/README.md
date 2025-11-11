# Library Management System (Mini Project)

## Objective
This project demonstrates the use of **Object-Oriented Programming (OOP)** concepts, **Collections Framework**, and **Exception Handling** in Java.  
It provides a simple **command-line application** to manage library operations such as adding, issuing, returning books, and calculating late fees.  
All operations are logged into a text file for record keeping.

---

## Features
- Add, issue, and return books.
- Calculate late fees with custom exceptions.
- Maintain library inventory using a `HashMap`.
- Handle invalid returns or issues using **custom exceptions**.
- Display available and issued books.
- Log every operation (issue, return, late fee) to a `library_log.txt` file.
- Interactive menu-based interface for user input.

---

## Class Structure

### 1. `Book.java`
Represents a book in the library.  
**Attributes:**
- `bookId` – Unique ID for the book
- `title` – Title of the book
- `author` – Author name
- `isIssued` – Availability status

**Key Methods:**
- `issueBook()` → Marks book as issued.
- `returnBook()` → Marks book as returned.
- `toString()` → Displays formatted book details.

---

### 2. `Member.java`
Represents a library member.  
**Attributes:**
- `memberId` – Unique ID for the member
- `name` – Member name

**Methods:**
- `toString()` → Displays member information.

---

### 3. `InvalidBookReturnException.java`
Custom exception to handle invalid return attempts.  
**Example use:**  
When a user tries to return a book that wasn’t issued or doesn’t exist.

---

### 4. `Library.java`
Manages library operations and data.  
**Uses `HashMap<String, Book>`** to store book details.

**Key Methods:**
- `addBook(Book book)` → Adds a new book.
- `displayBooks()` → Displays all books.
- `issueBook(String bookId, String memberId)` → Issues a book.
- `returnBook(String bookId)` → Returns a book.
- `calculateLateFee(int daysLate)` → Calculates fine (`₹5/day`).
- `logOperation(String message)` → Appends logs to `library_log.txt`.

---

### 5. `LibraryManagementApp.java`
Main class that runs the menu-driven interface.

**Menu Options:**
1. Display Books
2. Issue Book
3. Return Book
4. Calculate Late Fee
5. Exit

**Example Output:**
===== Library Menu =====

Display Books

Issue Book

Return Book

Calculate Late Fee

Exit
Enter choice: 1

=== Library Books ===
B101 | The Alchemist by Paulo Coelho [Available]
B102 | 1984 by George Orwell [Available]
B103 | Clean Code by Robert C. Martin [Available]
