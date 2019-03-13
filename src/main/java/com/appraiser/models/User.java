package com.appraiser.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username", columnDefinition = "VARCHAR (50) UNIQUE NOT NULL")
  private String name;

//  @Size(min = 8)
  @JsonIgnore
  private String password;

  // connection to house(s) data

  public User() {}
}
