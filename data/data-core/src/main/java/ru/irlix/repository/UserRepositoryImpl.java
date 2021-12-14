package ru.irlix.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.irlix.data.UserData;
import ru.irlix.mapper.UserMapper;
import ru.irlix.repository.jpa.UserRepositoryJpa;

@Service
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa repositoryJpa;

    private final UserMapper mapper;

    @Override
    public UserData findUser(String name) {
        return mapper.fromEntity(repositoryJpa.getByName(name));
    }
}
