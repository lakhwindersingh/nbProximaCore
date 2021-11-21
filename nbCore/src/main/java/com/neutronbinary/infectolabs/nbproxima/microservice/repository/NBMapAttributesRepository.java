package com.neutronbinary.infectolabs.nbproxima.microservice.repository;

import com.neutronbinary.infectolabs.nbproxima.microservice.domain.NBMapAttributes;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the NBMapAttributes entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NBMapAttributesRepository extends JpaRepository<NBMapAttributes, Long> {}
