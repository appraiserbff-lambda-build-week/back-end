package com.appraiser.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "username", unique = true, nullable = false)
  private String name;

  // connection to real estate data

  public User() {}
}
