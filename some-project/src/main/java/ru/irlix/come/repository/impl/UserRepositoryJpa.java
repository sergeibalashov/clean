package ru.irlix.come.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.irlix.come.entity.UserEntity;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, Integer> {

    UserEntity getByName(String name);
}
