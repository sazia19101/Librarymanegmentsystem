package Liberarymanegment;
import java.util.*;

abstract public class Userinfo {
    protected String name;
    protected String email;
    protected String phonenumber;
    Scanner s = new Scanner(System.in);

    public Userinfo(){

    }
    public Userinfo(String name){
        this.name=name;
    }
    public Userinfo(String name,String email,String phonenumber){
        this.name=name;
        this.email=email;
        this.phonenumber=phonenumber;
    }
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    } 
    public String getPhonenumber(){
        return phonenumber;
    }
    abstract public void Login();
    abstract public void newuser();


}
