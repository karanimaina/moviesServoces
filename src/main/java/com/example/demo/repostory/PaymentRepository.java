package com.example.demo.repostory;

import com.example.demo.model.Actor;
import com.example.demo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{
}
