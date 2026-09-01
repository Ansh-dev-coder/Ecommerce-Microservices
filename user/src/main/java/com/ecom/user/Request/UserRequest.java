package com.ecom.user.Request;

import com.ecom.user.Payload.AddressDTO;
import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private AddressDTO address;
}