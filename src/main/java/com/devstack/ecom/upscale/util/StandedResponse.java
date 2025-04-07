package com.devstack.ecom.upscale.util;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandedResponse {

    private int status;
    private String message;
    private Object data;

}
