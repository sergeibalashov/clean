package ru.irlix.repository;

import ru.irlix.data.UserData;

public interface UserRepository {

    UserData findUser(String name);
}
