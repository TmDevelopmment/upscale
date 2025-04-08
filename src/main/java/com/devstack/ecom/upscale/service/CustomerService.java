package com.devstack.ecom.upscale.service;

import com.devstack.ecom.upscale.dto.request.RequestCustomerDto;
import com.devstack.ecom.upscale.dto.response.ResponseCustomerDto;
import com.devstack.ecom.upscale.dto.response.pagination.CustomerPaginateDto;

public interface CustomerService {

    public void create(RequestCustomerDto dto);

    public ResponseCustomerDto findById(String id);

    public void update(RequestCustomerDto dto, String id);

    public CustomerPaginateDto findAll(String searchText,int page, int size);

    public void delete(String id); // New method to delete a customer by ID

}
