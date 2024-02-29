package com.iesam.user.presentation;

import com.iesam.user.data.UserDataRepository;
import com.iesam.user.domain.SaveUserUseCase;
import com.iesam.user.domain.User;

public class MainUser {
    public static void save(User user) {
        SaveUserUseCase saveUserUseCase = new SaveUserUseCase(UserDataRepository.newInstance());
        saveUserUseCase.execute(user);
    }
}
