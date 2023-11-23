package com.betrybe.agrix.models.repository;

import com.betrybe.agrix.models.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CropRepository interface.
 */
public interface CropRepository extends JpaRepository<Crop, Long> {

}
