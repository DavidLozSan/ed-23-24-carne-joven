package com.iesam.carneJoven.features.user.domain;

import java.util.ArrayList;

public interface UserRepository {
    void save(User user);
    void remove();
    User obtainUser(String nif);
    ArrayList<User> obtainUsers();
}
