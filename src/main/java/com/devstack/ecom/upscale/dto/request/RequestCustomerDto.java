package com.devstack.ecom.upscale.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestCustomerDto {

    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;

}
