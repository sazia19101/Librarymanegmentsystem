package Liberarymanegment;

public class NomalUser extends Userinfo {
    public NomalUser(){
       
    }
    public NomalUser(String name){
        super(name);
    }
    
    public NomalUser(String name,String email,String phonenumber){
        super(name,email,phonenumber);
    }

        public void Login(){
            System.out.println("Enter phone number:");
            String phonenumber= s.next();
            System.out.println("Enter Email:");
            String email= s.next();
        }
        public void newuser(){
            System.out.println("Enter user name: ");
            String name=s.next();
            System.out.println("Enter phone number:");
            String phonenumber= s.next();
            System.out.println("Enter Email:");
            String email= s.next();
           //System.out.println("1.Liberian\n2.Normal user ");
    
    
        }
}
