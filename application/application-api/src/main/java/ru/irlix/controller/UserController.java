package ru.irlix.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.irlix.dto.UserDto;
import ru.irlix.mapper.UserMapper;
import ru.irlix.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping
    public UserDto getUser(@RequestParam String name) {
        return userMapper.toDto(userService.find(name));
    }
}
