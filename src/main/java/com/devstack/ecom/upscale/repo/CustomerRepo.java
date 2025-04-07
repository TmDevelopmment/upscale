package com.devstack.ecom.upscale.repo;

import com.devstack.ecom.upscale.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {

    // Custom query methods can be defined here if needed
    // For example, findByEmail, findByName, etc.
    // JpaRepository provides basic CRUD operations out of the box



}
