package com.example.demo.repostory;

import com.example.demo.model.Actor;
import com.example.demo.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{
}
