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

  @Column(name = "lot-size")
  private double lotSize;

  @Column(name = "year-built")
  private double yearBuilt;

  @Column(name = "cost-per-square-foot")
  private double costPerSquareFoot;

  @Column(name = "hoa-fee-per-month")
  private double hoaFeePerMonth;

  // to be sent as an int via some map
  @Column(name = "property-type")
  private String propertyType;

  @Column(name = "property-age")
  private double propertyAge;
}
