package ru.irlix.come.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.irlix.come.entity.UserData;
import ru.irlix.come.mapper.UserEntityMapper;
import ru.irlix.come.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa repositoryJpa;

    private final UserEntityMapper mapper;

    @Override
    public UserData findUser(String name) {
        return mapper.fromEntity(repositoryJpa.getByName(name));
    }
}
