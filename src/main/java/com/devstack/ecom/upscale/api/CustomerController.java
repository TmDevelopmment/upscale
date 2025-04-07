package com.devstack.ecom.upscale.api;

import com.devstack.ecom.upscale.dto.request.RequestCustomerDto;
import com.devstack.ecom.upscale.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers") // http://localhost:8001/api/v1/customers
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @PostMapping()
    public String create(@RequestBody RequestCustomerDto dto) {
//        System.out.println(dto.getAddress());
        customerService.create(dto);
        return "customer created";
    }

    @PutMapping("/update")
    public String update(@RequestBody RequestCustomerDto dto) {
        return "customer update";
    }

    @GetMapping("/list")
    public String getAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ) {
        return "customer findAll";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        return "customer getById";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return "customer delete";
    }

}
