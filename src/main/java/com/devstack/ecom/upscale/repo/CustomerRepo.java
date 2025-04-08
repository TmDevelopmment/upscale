package com.devstack.ecom.upscale.repo;

import com.devstack.ecom.upscale.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer, String> {

    // Custom query methods can be defined here if needed
    // For example, findByEmail, findByName, etc.
    // JpaRepository provides basic CRUD operations out of the box

    @Query(value = "SELECT * FROM customers WHERE name name LIKE %?1% OR email LIKE %?1% OR phone LIKE %?1% OR address LIKE %?1% ORDER BY name DESC", nativeQuery = true)
    public Page<Customer> findAllWithSearchText(String searchText, Pageable pageable);

    @Query(value = "SELECT COUNT(*) FROM customers WHERE name name LIKE %?1% OR email LIKE %?1% OR phone LIKE %?1% OR address LIKE %?1%", nativeQuery = true)
    public long countAllWithSearchText(String searchText);

}
