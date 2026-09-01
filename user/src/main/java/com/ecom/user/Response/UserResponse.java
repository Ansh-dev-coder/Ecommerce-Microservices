package com.ecom.user.Response;


import com.ecom.user.Model.UserRole;
import com.ecom.user.Payload.AddressDTO;
import lombok.Data;

@Data
public class UserResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role;
    private AddressDTO address;
}