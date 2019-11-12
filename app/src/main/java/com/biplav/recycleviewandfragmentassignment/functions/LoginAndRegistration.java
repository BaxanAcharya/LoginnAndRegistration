package com.biplav.recycleviewandfragmentassignment.functions;

import com.biplav.recycleviewandfragmentassignment.model.User;

import java.util.ArrayList;
import java.util.List;

public class LoginAndRegistration {
    List<User> userList=new ArrayList<>();
    public void registration(String username, String password){
        userList.add(new User(username, password));
    }

    public boolean login(String username, String password){
        boolean loginStatus=true;
        for (int i=0; i<userList.size(); i++){
            if(userList.get(i).getUsername().compareTo(username)==0 && userList.get(i).getPassword().compareTo(password)==0){
                loginStatus=true;
            }
            else
                loginStatus= false;
        }
         return loginStatus;
    }



}
