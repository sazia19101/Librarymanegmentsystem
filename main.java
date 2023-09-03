package Liberarymanegment;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    Book obj = new Book();
    Liberian l = new Liberian();
    Student stu = new Student();
    Faculty fac =new Faculty();
    System.out.println("Welcome to the library!!!!!");
    System.out.println("Enter your status: ");
    System.out.println("1.Liberian\n 2.Student\n 3.Faculty.");
    int u= s.nextInt();
    switch(u){
        case 1:
        l.takeInput();
        do{
            
            System.out.println("1.Add Book\n"+
                    "2.Show All Books\n"+
                    "3.Borrow Book\n"+
                    "4.Return Book\n"+
                    "5.Exit\n");
    
            System.out.println("Enter Your Choice from menu!");
            int ch = s.nextInt();
            switch (ch){
             case 1:
                 obj.addbook();
                 
                 break;
             case 2:
                obj.showAllBooks();
                 break;
             
             case 3:
                obj.borrowBook();
                 break;
             case 4:
                 obj.returnBook();
                 break;
             case 5:
                 System.out.println("Thank you for Using Application !!");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Please Enter Valid Choice !");
    
             }
            }
             while(true);

        case 2:
        stu.takeInput();
        do{
            System.out.println("1.Show All Books\n"+
                    "2.Borrow Book\n"+
                    "3.Return Book\n"+
                    "4.Exit\n");
    
            System.out.println("Enter Your Choice from menu!");
            int ch = s.nextInt();
            switch (ch){
             case 1:
                obj.showAllBooks();
                 break;
             
             case 2:
                obj.borrowBook();
                 break;
             case 3:
                 obj.returnBook();
                 break;
             case 4:
                 System.out.println("Thank you for Using Application !!");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Please Enter Valid Choice !");
    
             }
            }
             while(true);
     case 3:
     fac.takeInput();
             do{
                
                System.out.println("1.Show All Books\n"+
                        "2.Borrow Book\n"+
                        "3.Return Book\n"+
                        "4.Exit\n");
        
                System.out.println("Enter Your Choice from menu!");
                int ch = s.nextInt();
                switch (ch){
                 case 1:
                    obj.showAllBooks();
                     break;
                 
                 case 2:
                    obj.borrowBook();
                     break;
                 case 3:
                     obj.returnBook();
                     break;
                 case 4:
                     System.out.println("Thank you for Using Application !!");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Please Enter Valid Choice !");
        
                 }
                }
                 while(true);

        default:
             System.out.println("Please Enter Valid Choice !");
    }

    }
}