package ru.irlix.service;

import ru.irlix.model.User;

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
