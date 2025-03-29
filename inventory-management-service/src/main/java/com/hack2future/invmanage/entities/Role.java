package com.hack2future.invmanage.entities;

import com.hack2future.invmanage.constants.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {

  @Id
  @Column(name = "ROLE_ID")
  private Integer roleId;

  @Column(name = "ROLE_NAME")
  private String name;


}