package com.betrybe.agrix.controller;

import com.betrybe.agrix.controller.dto.CropDto;
import com.betrybe.agrix.service.CropService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CropController class.
 */
@RestController
@RequestMapping("/crops")
public class CropController {

  @Autowired
  private final CropService cropService;

  /**
   * CropController constructor.
   */
  public CropController(CropService cropService) {
    this.cropService = cropService;
  }

  /**
   * Get all crops.
   */
  @GetMapping
  public ResponseEntity<List<CropDto>> getAllCrops() {
    List<CropDto> dtoCrop = cropService.getAllCrops().stream()
        .map(crop -> new CropDto(crop.getId(), crop.getName(),
            crop.getPlantedArea(), crop.getFarm().getId()))
        .toList();
    return new ResponseEntity<>(dtoCrop, HttpStatus.OK);
  }

}
