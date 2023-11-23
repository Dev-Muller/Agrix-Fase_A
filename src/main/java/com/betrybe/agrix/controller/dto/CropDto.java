package com.betrybe.agrix.controller.dto;

/**
 * CropDto class.
 */
public record CropDto(
    Long id,
    String name,
    Double plantedArea,
    Long farmId) {
  public CropDto toCropDto() {
    return new CropDto(id, name, plantedArea, farmId);
  }

}
