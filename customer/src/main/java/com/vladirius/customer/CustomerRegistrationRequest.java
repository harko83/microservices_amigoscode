package com.vladirius.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
