package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.models.entity.Crop;

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

  public static CropDto toDto(Crop crop) {
    return new CropDto(crop.getId(), crop.getName(), crop.getPlantedArea(), crop.getFarm().getId());
  }
}
