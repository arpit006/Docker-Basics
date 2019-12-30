package com.docker.smallApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
@Entity
@Table(name = "Person")
@Data
public class BaseEntity {

    @Id
    private int id;

    private String name;

    private int age;
}
