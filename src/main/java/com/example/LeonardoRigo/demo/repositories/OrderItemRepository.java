package com.example.LeonardoRigo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoRigo.demo.entities.OrderItem;
import com.example.LeonardoRigo.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
