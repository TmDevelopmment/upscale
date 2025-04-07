package com.devstack.ecom.upscale.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    @Column(name = "property_id", nullable = false, length = 80)
    private String propertyId;

    @Column(name = "customer_id",length = 40 , nullable = false)
    private String name;

    @Column(name = "customer_email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "customer_phone", length = 20, nullable = false)
    private String phone;

    @Column(name = "customer_address", length = 200, nullable = false)
    private String address;

    @Column(name = "is_active",columnDefinition = "TINYINT")
    private boolean isActive;

}
