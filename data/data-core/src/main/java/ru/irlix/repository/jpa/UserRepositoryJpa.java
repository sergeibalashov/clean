package ru.irlix.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.irlix.repository.entity.UserEntity;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, Integer> {

    UserEntity getByName(String name);
}
