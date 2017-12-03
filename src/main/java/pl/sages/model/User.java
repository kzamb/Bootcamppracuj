package pl.sages.model;

import lombok.Data;
import pl.sages.model.helpers.AbstractEntity;
import pl.sages.model.helpers.Role;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User extends AbstractEntity {
  private String email;
  private String password;
  private Role roles;
}
