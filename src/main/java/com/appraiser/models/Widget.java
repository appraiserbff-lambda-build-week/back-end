package com.appraiser.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "widgets")
public class Widget {
  @Id
  @GeneratedValue
  private Long id;

  private String name;
}
