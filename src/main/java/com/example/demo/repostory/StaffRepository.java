package com.example.demo.repostory;

import com.example.demo.model.Actor;
import com.example.demo.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer>{
}
