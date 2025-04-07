package com.devstack.ecom.upscale.api;

import com.devstack.ecom.upscale.dto.request.RequestCustomerDto;
import com.devstack.ecom.upscale.service.CustomerService;
import com.devstack.ecom.upscale.util.StandedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers") // http://localhost:8001/api/v1/customers
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @PostMapping()
    public ResponseEntity<StandedResponse> create(@RequestBody RequestCustomerDto dto) {
//        System.out.println(dto.getAddress());
        customerService.create(dto);
        return new ResponseEntity<>(
                new StandedResponse(
                        200,
                        "Customer created successfully",
                        null
                ),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<StandedResponse> update(
            @PathVariable String id,
            @RequestBody RequestCustomerDto dto
    ) {
        customerService.update(dto, id);
        return new ResponseEntity<>(
                new StandedResponse(
                        201,
                        "Customer updated successfully",
                        null
                ),
                HttpStatus.CREATED
        );
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
    public ResponseEntity<StandedResponse> getById(@PathVariable String id) {
        return new ResponseEntity<>(
                new StandedResponse(
                        201,
                        "Customer found successfully",
                        customerService.findById(id)
                ),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return "customer delete";
    }

}
