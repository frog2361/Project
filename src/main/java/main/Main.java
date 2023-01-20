package main;

import entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(33L,"Valera","Ivashko",18);
        User user2 = new User(33L,"Valera","Vashkevich",18);
        System.out.println(user1.equals(user2));
    }
}
