package ru.irlix.come.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserEntity {

    @Id
    private Integer id;

    private String name;
}
