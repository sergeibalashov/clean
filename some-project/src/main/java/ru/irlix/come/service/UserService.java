package ru.irlix.come.service;

import ru.irlix.come.dto.User;

/**
 * Интерфейс для управления моделью {@link User}
 */
public interface UserService {

    /**
     * Метод для поиска пользователя по имени
     * @param name имя пользователя
     * @return информация о пользователе
     */
    User find(String name);
}
