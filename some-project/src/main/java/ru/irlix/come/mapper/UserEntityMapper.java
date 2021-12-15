package ru.irlix.come.mapper;

import org.mapstruct.Mapper;
import ru.irlix.come.entity.UserData;
import ru.irlix.come.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toEntity(UserData user);

    UserData fromEntity(UserEntity user);
}
