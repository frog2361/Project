package main;

import entity.Order;
import entity.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(33L, "Valera", "Ivashko", 18);
        User user2 = new User(33L, "Valera", "Vashkevich", 18);
        System.out.println(user1.equals(user2));
        Order order = new Order();
        System.out.println(order.countOrderPrice(LocalDateTime.now(), LocalDateTime.parse("2023-01-25T22:11:03.46045"), new BigDecimal("0.002")));
    }
}
