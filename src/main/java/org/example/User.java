package org.example;

import java.util.Scanner;

public class User {
    private String userName;
    private String password;
    Basket basket;

    public User(String userName, String password, Basket basket) {
        this.userName = userName;
        this.password = password;
        this.basket = basket;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return userName;
    }

    public boolean checkUserNameAndPassword(Scanner scanner){
        int count = 3;
        while (count > 0){
            System.out.println("Enter user name, please: ");
            String userName = scanner.nextLine();
            System.out.println("Enter password, please");
            String password = scanner.nextLine();
            if (this.userName.equalsIgnoreCase(userName) && this.password.equals(password)){
                return true;
            }
            else{
                count--;
                System.out.println("error user name or password, try again, please:");
            }

        }
        scanner.close();
        return false;
    }
}