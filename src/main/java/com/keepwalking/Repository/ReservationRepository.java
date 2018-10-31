package com.keepwalking.Repository;

import com.keepwalking.Entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}