package ru.irlix.mapper;

import org.mapstruct.Mapper;
import ru.irlix.data.UserData;
import ru.irlix.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromData(UserData user);

    UserData toData(User user);
}
