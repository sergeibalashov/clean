package ru.irlix.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.irlix.mapper.UserMapper;
import ru.irlix.model.User;
import ru.irlix.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public User find(String name) {
        return userMapper.fromData(userRepository.findUser(name));
    }
}
