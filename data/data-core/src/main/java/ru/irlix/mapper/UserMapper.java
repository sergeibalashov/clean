package ru.irlix.mapper;

import org.mapstruct.Mapper;
import ru.irlix.data.UserData;
import ru.irlix.repository.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserData user);

    UserData fromEntity(UserEntity user);
}
