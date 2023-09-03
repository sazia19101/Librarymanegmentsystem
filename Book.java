package Liberarymanegment;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Library {

Scanner sc =new Scanner(System.in); 
    int bookid;
    String bookname;
    String authorname;
    String publishyear;
    int n;
    public Book(){

    }
    public  Book(String bookname,int bookid,String authorname,String publishyear){
      this.bookname=bookname;
      this.bookid=bookid;
      this.authorname=authorname;
      this.publishyear=publishyear;
    }
 
    public void addbook()
      {
        System.out.println("Enter the number of book you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt", true))) {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter Book name: ");
                String bookname = sc.nextLine();
                
                System.out.println("Enter book id: ");
                int bookid = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Enter author name: ");
                String authorname = sc.nextLine();
                System.out.println("Enter Book publish year: ");
                String publishyear = sc.nextLine();
                
                String bookData = bookname + "," + bookid + "," + authorname + "," + publishyear;
                writer.write(bookData);
                writer.newLine();
            }
            System.out.println("Book data written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing book data to file: " + e.getMessage());
        }
      }
    
      public void showAllBooks(){
        int totalBooks = 0;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            System.out.println("All books in the system:");
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    String bookname = fields[0];
                    int bookid = Integer.parseInt(fields[1]);
                    String authorname = fields[2];
                    String publishyear = fields[3];
                    
                    System.out.println("Book name: " + bookname);
                    System.out.println("Book id: " + bookid);
                    System.out.println("Author name: " + authorname);
                    System.out.println("Publish Year: " + publishyear);
                    System.out.println();
    
                    totalBooks++; 
                }
            }
            System.out.println("Total number of books: " + totalBooks); 
                } catch (IOException e) {
            System.out.println("An error occurred while reading book data from file: " + e.getMessage());
        }
    }
  public void borrowBook() {
    try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
        String line;
        List<String> bookData = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            bookData.add(line);
        }
        System.out.println("Enter book name you want to borrow:");
        String borrowName = sc.nextLine();
        System.out.println("Enter book id:");
        int borrowId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter borrower's name:");
        String borrowerName = sc.nextLine();
        boolean bookFound = false;
        for (int i = 0; i < bookData.size(); i++) {
            String[] fields = bookData.get(i).split(",");
            if (fields.length == 4) {
                String bookname = fields[0];
                int bookid = Integer.parseInt(fields[1]);
                String authorname = fields[2];
                String publishyear = fields[3];
                if (bookname.equalsIgnoreCase(borrowName) && bookid == borrowId) {
                    bookData.set(i, bookname + "," + bookid + "," + authorname + "," + publishyear + "," + borrowerName);
                    bookFound = true;
                    break;
                }
            }
        } if (bookFound) {
          try (FileWriter writer = new FileWriter("books.txt")) {
              for (String data : bookData) {
                  writer.write(data + "\n");
              }
              System.out.println("Book borrowed successfully!");
          } catch (IOException e) {
              System.out.println("An error occurred while updating book data: " + e.getMessage());
          }
      } else {
          System.out.println("Book not found!");
      }
  } catch (IOException e) {
      System.out.println("An error occurred while reading book data from file: " + e.getMessage());
  }
}
public void returnBook() {
  try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
      String line;
      List<String> bookData = new ArrayList<>();
      while ((line = reader.readLine()) != null) {
          bookData.add(line);
      }
      System.out.println("Enter book name you want to return:");
      String returnName = sc.nextLine();
      System.out.println("Enter book id:");
      int returnId = sc.nextInt();
      sc.nextLine();
      
      boolean bookFound = false;
      for (int i = 0; i < bookData.size(); i++) {
          String[] fields = bookData.get(i).split(",");
          if (fields.length == 5) {
              String bookname = fields[0];
              int bookid = Integer.parseInt(fields[1]);
              String authorname = fields[2];
              String publishyear = fields[3];
                    String borrowerName = fields[4];
                    if (bookname.equalsIgnoreCase(returnName) && bookid == returnId) {
                        bookData.set(i, bookname + "," + bookid + "," + authorname + "," + publishyear);
                        bookFound = true;
                        break;
                    }
                }
            }
            if (bookFound) {
                try (FileWriter writer = new FileWriter("books.txt")) {
                    for (String data : bookData) {
                        writer.write(data + "\n");
                    }
                    System.out.println("Book returned successfully!");
                } catch (IOException e) {
                    System.out.println("An error occurred while updating book data: " + e.getMessage());
                }
            } else {
                System.out.println("Book not found!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading book data from file: " + e.getMessage());
        }
    }

} 