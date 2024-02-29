package com.iesam.carneJoven.features.user.data;

import com.iesam.carneJoven.features.user.data.local.UserFileLocalDataSource;
import com.iesam.carneJoven.features.user.domain.User;
import com.iesam.carneJoven.features.user.domain.UserRepository;

import java.util.ArrayList;

public class UserDataRepository implements UserRepository {
    public static UserDataRepository instance = null;
    private UserFileLocalDataSource localUsers = new UserFileLocalDataSource();

    public static UserDataRepository newInstance() {
        if (instance == null) {
            instance = new UserDataRepository();
        }
        return instance;
    }

    @Override
    public void save(User user) {
        localUsers.saveUser(user);
    }

    @Override
    public void remove() {
        localUsers.clear();
    }

    @Override
    public User obtainUser(String nif) {
        return localUsers.obtainUser(nif);
    }

    @Override
    public ArrayList<User> obtainUsers() {
        return localUsers.obtainUsers();
    }
}
