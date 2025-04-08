package com.devstack.ecom.upscale.adbiser;

import com.devstack.ecom.upscale.exception.EntryNotFoundException;
import com.devstack.ecom.upscale.util.StandedResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class AppWideExceptionHandle {

    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<StandedResponse> handleEntryNotFoundException(EntryNotFoundException e) {
        return new ResponseEntity<>(
                new StandedResponse(404,e.getMessage(),e), HttpStatus.NOT_FOUND
        );
    }

}
