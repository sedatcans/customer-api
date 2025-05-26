package com.sonat.customerapi.controller.error;

public enum ErrorCode {

    CUSTOMER_NOT_FOUND("Customer Not Found"),
    CUSTOMER_ALREADY_EXISTS("Customer Already Exist"),
    CUSTOMER_INVALID_REQUEST("Customer Invalid"),
    CUSTOMER_INVALID_EMAIL("Customer Email Is Not Valid"),
    CUSTOMER_INVALID_PHONE("Customer Phone Is Not Valid"),
    CUSTOMER_INVALID_NAME("Customer Name Is Not Valid"),
    CUSTOMER_INVALID_SURNAME("Customer Surname Is Not Valid");

    ErrorCode(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private String errorMessage;

    public String getEnumValue() {
        return errorMessage;
    }
}
