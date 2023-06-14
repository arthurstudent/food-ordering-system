package com.food.ordering.system.service.dataaccess.order.repository;

import com.food.ordering.system.service.dataaccess.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderEntity, UUID> {

    @EntityGraph("order-entity-graph")
    Optional<OrderEntity> findByTrackingId(UUID uuid);
}
