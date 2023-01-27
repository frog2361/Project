package main;

import entity.Airport;
import entity.Order;
import entity.User;
import entity.UserStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(33L, "Valera", "Ivashko", 18, UserStatus.FRIENDLY);
        User user2 = new User(33L, "Valera", "Vashkevich", 18, UserStatus.BLOCKED);
        System.out.println(user1.equals(user2));
        Order order = new Order();
        System.out.println(order.countOrderPrice(LocalDateTime.now(), LocalDateTime.parse("2023-01-25T22:11:03.46045"), new BigDecimal("0.002")));
        Airport airport = new Airport();
        airport.passPersonToAirplane(LocalDateTime.parse("2023-01-25T10:35:12.46045"), LocalDateTime.parse("2023-01-25T10:30:00.00000"), LocalDateTime.parse("2023-01-25T10:45:00.00000"), user2.getUserStatus());
    }
}
