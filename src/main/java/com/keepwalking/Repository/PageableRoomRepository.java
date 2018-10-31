package com.keepwalking.Repository;

import com.keepwalking.Entity.RoomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PageableRoomRepository extends PagingAndSortingRepository<RoomEntity, Long> {

    Page<RoomEntity> findById(Long id, Pageable page);

}
