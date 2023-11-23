package com.betrybe.agrix.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Crop entity.
 */
@Entity
@Table(name = "crops")
@Data
public class Crop {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double plantedArea;
  @ManyToOne
  @JoinColumn(name = "farm_id")
  private Farm farm;

  public Crop() {
  }

  /**
   * Crop constructor.
   */
  public Crop(Long id, String name, Double plantedArea) {
    this.id = id;
    this.name = name;
    this.plantedArea = plantedArea;
  }
}
