package com.services;

import com.beans.User;
import com.dao.UserDao;

import java.util.List;

public class LoginService {

    private UserDao usr;
    public LoginService(){
        usr = new UserDao();
    }
    public User getUser(String userName){
        List<User> list = usr.login(); //from database using the login method
        for (User u :
                list) {
            if (u.getUsername().equalsIgnoreCase(userName.toLowerCase())){
                return u;
            }
        }
        return null;
    }
    public boolean checkUser(User o, String uname, String upass ){
        if (o!=null){
        if (o.getUsername().equalsIgnoreCase(uname)&& o.getPassword().equals(upass)){
            return true;
        }}
        return false;
    }
}
