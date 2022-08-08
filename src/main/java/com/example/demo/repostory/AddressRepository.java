package com.example.demo.repostory;

import com.example.demo.model.Actor;
import com.example.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer>{
}
