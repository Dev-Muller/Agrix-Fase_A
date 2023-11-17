package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entity.Farm;
import com.betrybe.agrix.models.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * FarmService class.
 */
@Service
public class FarmService {

  @Autowired
  FarmRepository farmRepository;

  public Farm createFarm(Farm farm) {
    return farmRepository.save(farm);
  }
}
