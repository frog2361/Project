package entity;

import valid.Valid;

import java.time.LocalDateTime;

public class Airport {
    public void passPersonToAirplane(LocalDateTime personCameAt, LocalDateTime boardingTimeWillStartAt, LocalDateTime airplaneWillFlyAt) {
        Valid.checkIfPersonComeLate(personCameAt, airplaneWillFlyAt);
        Valid.checkIfPersonEarly(personCameAt, boardingTimeWillStartAt);
        System.out.println("Человек успешно сел на борт");
    }
}
