package com.keepwalking.Repository;

import java.util.Optional;

import com.keepwalking.Entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;


public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
    Optional<RoomEntity> findById(Long id);
//    List<RoomEntity> findById(Long id);
}


