package com.neutronbinary.infectolabs.nbproxima.repository;

import com.neutronbinary.infectolabs.nbproxima.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
