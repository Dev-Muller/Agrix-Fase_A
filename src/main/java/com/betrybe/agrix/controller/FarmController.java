package com.betrybe.agrix.controller;

import com.betrybe.agrix.controller.dto.FarmDto;
import com.betrybe.agrix.models.entity.Farm;
import com.betrybe.agrix.service.FarmService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FarmController class.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {

  private final FarmService farmService;

  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * Create a farm.
   */
  @PostMapping
  public ResponseEntity<Farm> createFarm(@RequestBody Farm farm) {
    Farm newFarm = farmService.createFarm(farm);
    FarmDto newFarmDto = new FarmDto(newFarm.getId(), newFarm.getName(), newFarm.getSize());
    return ResponseEntity.status(HttpStatus.CREATED).body(newFarmDto.toFarm());
  }

  /**
   * Get all farms.
   */
  @GetMapping
  public ResponseEntity<List<Farm>> getAllFarms() {
    return new ResponseEntity<>(farmService.getAllFarms(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Farm> getFarmById(@PathVariable Long id) {
    return new ResponseEntity<>(farmService.getFarmById(id), HttpStatus.OK);
  }
}
