package ru.irlix.come.mapper;

import org.mapstruct.Mapper;
import ru.irlix.come.dto.User;
import ru.irlix.come.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    User fromDto(UserDto user);

    UserDto toDto(User user);
}
