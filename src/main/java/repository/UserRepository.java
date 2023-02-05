package repository;

import entity.User;

import java.util.List;

public interface UserRepository {
    void save(User user);

    User findById(Long id);

    User findByLastName(String lastName);

    List<User> findAll();

    void delete(Long id);

    void update(User user);
}
