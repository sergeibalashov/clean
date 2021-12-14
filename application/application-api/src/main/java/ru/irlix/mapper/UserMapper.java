package ru.irlix.mapper;

import org.mapstruct.Mapper;
import ru.irlix.dto.UserDto;
import ru.irlix.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromDto(UserDto user);

    UserDto toDto(User user);
}
