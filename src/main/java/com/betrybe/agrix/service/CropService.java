package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entity.Crop;
import com.betrybe.agrix.models.repository.CropRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CropService class.
 */
@Service
public class CropService {

  @Autowired
  CropRepository cropRepository;

  public Crop createCrop(Crop crop) {
    return cropRepository.save(crop);
  }

  public List<Crop> getAllCrops() {
    return cropRepository.findAll();
  }

  /**
   * Get a crop by id.
   */
  public Crop getCropById(Long id) {
    return cropRepository.findById(id).get();
  }
}
