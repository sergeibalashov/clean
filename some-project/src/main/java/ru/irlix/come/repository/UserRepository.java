package ru.irlix.come.repository;

import ru.irlix.come.entity.UserData;

public interface UserRepository {

    UserData findUser(String name);
}
