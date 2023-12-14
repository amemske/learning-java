package com.libraryApp;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class LibraryApp {


static class Book {
	    String title;
	    String author;
	    int quantity;

	    public Book(String title, String author, int quantity) {
	        this.title = title;
	        this.author = author;
	        this.quantity = quantity;
	    }
	}
	
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> library = new ArrayList<>();
    int bookCount = 0;

    while (true) {
        System.out.println("Choose an option: 1, 2, 3, or 4");
        System.out.println("- To add a book, type 1 ");
        System.out.println("- To borrow a book, type 2");
        System.out.println("- To return a book, type 3");
        System.out.println("- To exit, type 4");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();  // read and process a new line

        if (choice == 1) {
            // Add Books
            System.out.print("Enter book title: ");
            String newTitle = scanner.nextLine().toLowerCase();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            boolean validBook = false;

            do {
                try {
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // read and process a new line

                    // Check if the book already exists
                    boolean bookExists = false;
                    for (Book book : library) {
                        if (book.title.equals(newTitle)) {
                            // Book exists, update quantity
                            book.quantity += quantity;
                            bookExists = true;
                            break;
                        }
                    }

                    if (!bookExists) {
                        // Book is new, add it to the library
                        library.add(new Book(newTitle, author, quantity));
                        validBook = true;  // Set to true only if book is added successfully
                        System.out.println("Book added successfully.");
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Enter an integer for quantity.");
                    scanner.next();  // read and process input
                }
            } while (!validBook);
        } else if (choice == 2) {
            // Borrow Books
            System.out.print("Enter book title: ");
            String borrowTitle = scanner.nextLine().toLowerCase();
            
            boolean validBook = false;

            do {
                try {
            System.out.print("Enter number of books to borrow: ");
            int borrowQuantity = scanner.nextInt();
            scanner.nextLine();  // read and process new line character

            // Check if the requested number of books is available
            boolean bookFound = false;
            for (Book book : library) {
                if (book.title.equals(borrowTitle) && book.quantity >= borrowQuantity) {
                    // Books are available, update quantity
                    book.quantity -= borrowQuantity;
                    bookFound = true;
                    System.out.println("Books borrowed successfully.");
                    validBook = true;
                    break;
                }
            }

            if (!bookFound) {
                System.out.println("Error: Books not available or insufficient quantity.");
            }
                }catch (InputMismatchException e) {
                System.out.println("Error: Enter an integer for quantity.");
                scanner.next(); // read and process invalid input
            }
        } while (!validBook);
        } else if (choice == 3) {
        	
            // Return Books
            System.out.print("Enter book title: ");
            String returnTitle = scanner.nextLine().toLowerCase();
            boolean validBook = false;

            do {
                try {
            System.out.print("Enter number of books to return: ");
            int returnQuantity = scanner.nextInt();
            scanner.nextLine();  // read and process newline character

            // Check if the returned books belong to the library system
            boolean bookReturned = false;
            for (Book book : library) {
                if (book.title.equals(returnTitle)) {
                    // Books match, update quantity
                    book.quantity += returnQuantity;
                    bookReturned = true;
                    System.out.println("Books returned successfully.");
                    validBook = true;
                    break;
                }
            }

            if (!bookReturned) {
                System.out.println("Error: Returned books do not belong to the library system.");
            }
                }catch (InputMismatchException e) {
                    System.out.println("Error: Enter an integer for quantity.");
                    scanner.next();  // read and process input
                }
            } while (!validBook);
            
        } else if (choice == 4) {
            // Exit
            System.out.println("Exiting program.");
            System.exit(0);
        } else {
            // Default: Invalid choice
            System.out.println("Error: Invalid choice. Please enter a valid option.");
        }
    }
}
}