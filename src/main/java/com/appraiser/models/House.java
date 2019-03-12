package com.appraiser.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "houses")
public class House {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private double beds;

  private double baths;

  @Column(name = "square_feet")
  private double squareFeet;

  @Column(name = "lot_size")
  private double lotSize;

  @Column(name = "hoa_fee_per_month")
  private double hoaFeePerMonth;

  // to be sent as an int via some map
  @Column(name = "property_type")
  private String propertyType;

  @Column(name = "property_age")
  private double propertyAge;
}
