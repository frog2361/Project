package valid;

import exception.NotAvailableException;

import java.time.LocalDateTime;

public class Valid {
    public static void checkIfPersonEarly(LocalDateTime personCameAt, LocalDateTime boardingTimeWillStartAt) {
        if (personCameAt.isBefore(boardingTimeWillStartAt)) {
            throw new NotAvailableException("Человек пришёл рано");
        }
    }

    public static void checkIfPersonComeLate(LocalDateTime personCameAt, LocalDateTime airplaneWillFlyAt) {
        if (personCameAt.isAfter(airplaneWillFlyAt)) {
            throw new NotAvailableException("Человек опоздал");
        }
    }
}
