package ru.irlix.come.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.irlix.come.dto.UserDto;
import ru.irlix.come.mapper.UserDtoMapper;
import ru.irlix.come.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserDtoMapper userMapper;

    @GetMapping
    public UserDto getUser(@RequestParam String name) {
        return userMapper.toDto(userService.find(name));
    }
}
