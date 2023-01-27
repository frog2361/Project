package entity;

import valid.Valid;

import java.time.LocalDateTime;

public class Airport {
    public void passPersonToAirplane(LocalDateTime personCameAt, LocalDateTime boardingTimeWillStartAt, LocalDateTime airplaneWillFlyAt, UserStatus userStatus) {
        Valid.checkIfPersonComeLate(personCameAt, airplaneWillFlyAt);
        Valid.checkIfPersonEarly(personCameAt, boardingTimeWillStartAt);
        Valid.checkIfPersonBlocked(userStatus);
        System.out.println("Человек успешно сел на борт");
    }
}
