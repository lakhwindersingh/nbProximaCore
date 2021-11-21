package com.neutronbinary.infectolabs.nbproxima.microservice.repository;

import com.neutronbinary.infectolabs.nbproxima.microservice.domain.NBPalette;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the NBPalette entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NBPaletteRepository extends JpaRepository<NBPalette, Long> {}
