package valid;

import entity.User;
import entity.UserStatus;
import exception.NotAvailableException;

import java.time.LocalDateTime;
import java.util.List;

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

    public static void checkIfPersonBlocked(UserStatus userStatus) {
        if (userStatus.equals(UserStatus.BLOCKED)) {
            throw new NotAvailableException("Вы заблокированы");
        }
    }

    public static void checkIfUserAlreadyExist(Long id, List<User> userList) {
        for (User userFromRepository : userList) {
            if (userFromRepository.getId().equals(id)) {
                throw new NotAvailableException("Пользователь уже существует");
            }
        }
    }
}
