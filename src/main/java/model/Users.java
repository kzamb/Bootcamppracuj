package model;

import model.helpers.AbstractEntity;
import model.helpers.Role;

import javax.persistence.Table;

@Table(name = "users")
public class Users extends AbstractEntity {
    private String email;
    private String password;
    private Role roles;
}
