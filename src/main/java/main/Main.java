package main;

import entity.User;
import entity.UserStatus;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(33L, "Valera", "Ivashko", 18, UserStatus.FRIENDLY);
        User user2 = new User(33L, "Valera", "Vashkevich", 18, UserStatus.BLOCKED);
        UserRepository userRepository = new UserRepositoryImpl(new ArrayList<>());
        userRepository.save(user1);
        userRepository.save(user2);
        System.out.println(userRepository.findAll());
        userRepository.update(new User(35L, "Igor", "Vashkevich", 19, UserStatus.FRIENDLY));
        System.out.println(userRepository.findAll());
    }
}
