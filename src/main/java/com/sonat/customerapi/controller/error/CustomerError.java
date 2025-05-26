package com.sonat.customerapi.controller.error;

import lombok.Builder;

@Builder
public class CustomerError {
    public ErrorCode code;
    public String message;
}
