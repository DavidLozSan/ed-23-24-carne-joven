package com.iesam.user.data;

import com.iesam.user.domain.User;
import com.iesam.user.domain.UserRepository;

import java.util.ArrayList;

public class UserDataRepository implements UserRepository {
    public static UserDataRepository instance = null;
    private ArrayList<User> localUsers = new ArrayList<>();

    public static UserDataRepository newInstance() {
        if (instance == null) {
            instance = new UserDataRepository();
        }
        return instance;
    }

    @Override
    public void save(User user) {
        localUsers.add(user);
    }
}
