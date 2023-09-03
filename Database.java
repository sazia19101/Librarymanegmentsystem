package Liberarymanegment;
import java.util.*;

public class Database {
    ArrayList<Userinfo> users = new ArrayList<Userinfo>();
    ArrayList<String>usernames=new ArrayList<String>();

    public void AddUser(Userinfo u){
        users.add(u);
        usernames.add(u.getName());
    }
    public int Login(String phonenumber,String email){
        int n3 = -1;
        for(Userinfo u : users){
            if(u.getPhonenumber().matches(phonenumber) && u.getEmail().matches(email)){
                n3 = users.indexOf(u);
                break;
            }
        }
        return n3;
    }
    public Userinfo getUserinfo(String phonenumber,String email){
        return users.get(n3);
    }
}