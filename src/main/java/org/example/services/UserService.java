package org.example.services;

import org.example.helpers.AppHelperUserInput;
import org.example.model.User;

import java.util.Scanner;

public class UserService {
    private final Scanner scanner;

    public UserService(Scanner scanner) {
        this.scanner = scanner;
    }
    public boolean addUser(AppHelperUserInput appHelperUserInput){
        User user = appHelperUserInput.createUser(scanner);
        if(user != null){
            return true;
        }else{
            return false;
        }
    }

}
