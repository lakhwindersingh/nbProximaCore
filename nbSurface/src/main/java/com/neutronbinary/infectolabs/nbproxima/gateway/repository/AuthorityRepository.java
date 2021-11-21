package com.neutronbinary.infectolabs.nbproxima.gateway.repository;

import com.neutronbinary.infectolabs.nbproxima.gateway.domain.Authority;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
