package repository.impl;

import entity.User;
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
}
