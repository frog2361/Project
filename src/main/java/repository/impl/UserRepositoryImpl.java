package repository.impl;

import entity.User;
import exception.NotDataFoundException;
import repository.UserRepository;
import valid.Valid;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<User> userList;

    public UserRepositoryImpl(List<User> userList) {
        this.userList = userList;
    }

    public UserRepositoryImpl() {
    }

    @Override
    public void save(User user) {
        Valid.checkIfUserAlreadyExist(user.getId(), userList);
        userList.add(user);
    }

    @Override
    public User findById(Long id) {
        for (User userFromRepository : userList) {
            if (userFromRepository.getId().equals(id)) {
                return userFromRepository;
            }
        }
        throw new NotDataFoundException("Пользователь не найден");
    }

    @Override
    public User findByLastName(String lastName) {
        for (User userFromRepository : userList) {
            if (userFromRepository.getLastName().equals(lastName)) {
                return userFromRepository;
            }
        }
        throw new NotDataFoundException("Пользователь не найден");
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public void delete(Long id) {
        User user = findById(id);
        userList.remove(user);
    }

    @Override
    public void update(User user) {
        User userFromRepository = findById(user.getId());
        userFromRepository.setName(user.getName());
        userFromRepository.setLastName(user.getLastName());
        userFromRepository.setAge(user.getAge());
        userFromRepository.setUserStatus(user.getUserStatus());
    }
}
