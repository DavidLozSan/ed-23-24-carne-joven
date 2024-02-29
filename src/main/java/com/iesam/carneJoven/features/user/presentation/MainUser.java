package com.iesam.carneJoven.features.user.presentation;

import com.iesam.carneJoven.features.user.data.UserDataRepository;
import com.iesam.carneJoven.features.user.domain.*;

public class MainUser {
    public static void save(User user) {
        SaveUserUseCase saveUserUseCase = new SaveUserUseCase(UserDataRepository.newInstance());
        saveUserUseCase.execute(user);
    }

    public static void remove() {
        RemoveUsersUseCase removeUsersUseCase = new RemoveUsersUseCase(UserDataRepository.newInstance());
        removeUsersUseCase.execute();
    }

    public static void obtainUser(String nif) {
        GetUserUseCase getUserUseCase = new GetUserUseCase(UserDataRepository.newInstance());
        getUserUseCase.execute(nif);
    }

    public static void obtainUsers() {
        GetUsersUseCase getUsersUseCase = new GetUsersUseCase(UserDataRepository.newInstance());
        getUsersUseCase.execute();
    }
}
